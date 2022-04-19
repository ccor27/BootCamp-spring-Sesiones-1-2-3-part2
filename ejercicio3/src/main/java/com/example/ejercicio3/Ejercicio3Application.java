package com.example.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);
		PersonaRepository personaRepository = context.getBean(PersonaRepository.class);
		Persona persona = new Persona(null,"juan",18,"juan@gmail.com");
		System.out.println("numero de personas: "+personaRepository.count());
		personaRepository.save(persona);
		System.out.println("numero de personas: "+personaRepository.count());
		System.out.println(persona);
	}

}
