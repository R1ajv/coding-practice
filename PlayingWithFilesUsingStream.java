package com.interview.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class PlayingWithFilesUsingStream {

	public static void main(String[] args) throws IOException {
		
		/*Files.lines(Paths.get("C:\\Users\\Rajeev\\OneDrive\\Documents\\demo.txt"))
		.map(str->str.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.filter(m->m.replaceFirst(".",""))
		.sorted()
		.forEach(System.out::println);;*/
		
	Runnable runnable =	()->{
			for(int i = 0 ; i <= 100 ; i++) {
				System.out.println(" Thread :"+Thread.currentThread() + " "+ Thread.currentThread().getId() +  " "+ i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
