package com.mediscreen.notes.service;

import com.mediscreen.notes.model.Note;
import com.mediscreen.notes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    public Optional<Note> getNoteById(String id) {
        return noteRepository.findById(id);
    }

    public List<Note> getAllNotes(int patientId) {
        return noteRepository.findAllByPatientId(patientId);
    }

    public void updateNote(Note note) {
        noteRepository.save(note);
    }

    public void deleteNoteById(String id) {
        noteRepository.deleteById(id);
    }
    
}
