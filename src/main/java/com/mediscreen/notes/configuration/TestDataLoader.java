package com.mediscreen.notes.configuration;


import com.mediscreen.notes.model.Note;
import com.mediscreen.notes.repository.NoteRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestDataLoader implements ApplicationListener<ApplicationReadyEvent> {

    private final NoteRepository noteRepository;

    public TestDataLoader(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        noteRepository.deleteAll();
        List<Note> notes = new ArrayList<>();
        notes.add(new Note(null, 5, "Patient states that they are feeling a great deal of stress at work Patient also complains that their hearing seems Abnormal as of late"));
        noteRepository.saveAll(notes);
    }
}
