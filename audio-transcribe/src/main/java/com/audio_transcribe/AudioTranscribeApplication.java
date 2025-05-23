package com.audio_transcribe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class AudioTranscribeApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load(); // this reads the .env file
        System.setProperty("OPENAI_API_KEY", dotenv.get("OPENAI_API_KEY"));
		SpringApplication.run(AudioTranscribeApplication.class, args);
	}

	
	
	
	
}
