package com.mediscreen.notes;

import com.mediscreen.notes.controller.NoteController;
import com.mediscreen.notes.repository.NoteRepository;
import com.mediscreen.notes.service.NoteService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@EnableMongoRepositories
@EnableConfigurationProperties
public class TestContext {

	@Bean
	public NoteService noteService(NoteRepository noteRepository) {
		return new NoteService(noteRepository);
	}

	@Bean
	public NoteController noteController(NoteService noteService) {
		return new NoteController(noteService);
	}

}
