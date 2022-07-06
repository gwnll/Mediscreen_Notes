package com.mediscreen.notes;

import com.mediscreen.notes.model.Note;
import com.mediscreen.notes.service.NoteService;
import org.apache.commons.collections4.IterableUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;


@DataMongoTest
@ContextConfiguration(classes = TestContext.class)
@ExtendWith(SpringExtension.class)
public class NoteServiceTest {

    @Autowired
    NoteService noteService;

    @Test
    public void addNote() {
        int notesAmountBefore = IterableUtils.size(noteService.getAllNotes(1));
        Note noteTest = new Note("63", 1, "observations");
        noteService.addNote(noteTest);
        int notesAmountAfter = IterableUtils.size(noteService.getAllNotes(1));
        Assertions.assertTrue(notesAmountBefore < notesAmountAfter);
    }

    @Test
    public void getNoteById() {
        noteService.addNote(new Note("59", 2, "observations"));
        Optional<Note> noteTest = noteService.getNoteById("59");
        Assertions.assertTrue(noteTest.isPresent());
    }

    @Test
    public void getAllNotes() {
        Note noteTest = new Note("27", 3, "observations");
        noteService.addNote(noteTest);
        List<Note> allNotes = (List<Note>) noteService.getAllNotes(3);
        Assertions.assertTrue(allNotes.contains(noteTest));
    }

    @Test
    public void updateNote() {
        Note noteTest = new Note("43", 4, "observations");
        noteTest.setObservations("new observations");
        noteService.updateNote(noteTest);
        List<Note> notes = noteService.getAllNotes(4);
        Optional<Note> note = notes.stream().filter(n -> n.getObservations().equals("new observations")).findAny();
        Assertions.assertTrue(note.isPresent());
    }

    @Test
    public void deleteNoteById() {
        Note noteTest = new Note("11", 5, "observations");
        noteService.addNote(noteTest);
        noteService.deleteNoteById("11");
        Optional<Note> noteTestCheck = noteService.getNoteById("11");
        Assertions.assertFalse(noteTestCheck.isPresent());
    }
}
