package com.sutherlandwoods.learnjavabasics;

import com.sutherlandwoods.learnjavabasics.lessons.Lesson01;
import com.sutherlandwoods.learnjavabasics.lessons.Lesson02;
import com.sutherlandwoods.learnjavabasics.lessons.Lesson03;
import com.sutherlandwoods.learnjavabasics.lessons.Lesson04;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main class that starts when you run the program
 */
@SpringBootApplication
public class LearnJavaBasicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LearnJavaBasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===========================================");
		System.out.println("This is the beginning of the lesson output");
		System.out.println("===========================================");
		System.out.println("\n\n");
		//this runs Lesson01!
		Lesson01.run();
		Lesson02.run();
		Lesson03.run();
		Lesson04.run();
		System.out.println("\n\n");
		System.out.println("===========================================");
		System.out.println("This is the end of the lesson output");
		System.out.println("===========================================");
	}


}
