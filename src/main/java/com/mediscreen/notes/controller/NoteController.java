package com.mediscreen.notes.controller;

import com.mediscreen.notes.model.Note;
import com.mediscreen.notes.service.NoteService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/note/addNote")
    public void validate(@RequestBody @Valid Note note) {
        noteService.addNote(note);
    }

    @GetMapping("/note/{noteId}")
    public Note getNoteById(@PathVariable String noteId) {
        return noteService.getNoteById(noteId).orElseThrow(() -> new IllegalArgumentException("Invalid note Id:" + noteId));
    }

    @GetMapping("/{patientId}/note/list")
    public List<Note> getAllNotes(@PathVariable Integer patientId) {
        return noteService.getAllNotes(patientId);
    }

    @PostMapping("/note/update")
    public void updateNote(@RequestBody @Valid Note note) {
        noteService.updateNote(note);
    }

    @GetMapping("/note/delete/{noteId}")
    public void deleteNote(@PathVariable String noteId) {
        noteService.deleteNoteById(noteId);
    }

}
