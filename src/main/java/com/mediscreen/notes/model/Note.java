package com.mediscreen.notes.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Document(collection="Note")
public class Note {

    @Id
    private String id;

    public Integer patientId;

    @NotNull(message = "observations cannot be null")
    public String observations;

    public Note(String id, Integer patientId, String observations) {
        this.id = id;
        this.patientId = patientId;
        this.observations = observations;
    }
}
