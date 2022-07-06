package com.mediscreen.notes.repository;

import com.mediscreen.notes.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends MongoRepository<Note, String> {

    List<Note> findAllByPatientId(int patientId);

    void deleteById(String id);

    Optional<Note> findById(String id);
}
