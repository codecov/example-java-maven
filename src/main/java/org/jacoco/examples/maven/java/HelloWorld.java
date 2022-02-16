package org.jacoco.examples.maven.java;

import java.io.*;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			System.out.println("teste");
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
