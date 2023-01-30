package Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class App {
	  public static void main(String[] args) throws IOException {

	        final Path pathToInputFile = Paths.get("src/nio/contact.txt");

	        Files.lines(pathToInputFile).forEach(line -> {
	            System.out.println(line);
	        }); 


	        Path p2 = Paths.get("src/nio/newfilecreated.txt");
	        if (p2.toFile().exists()) {
	        	p2.toFile().delete();
	        } else {
	        	p2.toFile().createNewFile();
	        }
	     

	        final Path pathToOutputFile = Paths.get("src/nio/newfilecreated.txt");

	        Files.lines(pathToInputFile).forEach(line -> {
	            try {
	            		Files.write(pathToOutputFile, String.format("%s%n",line).getBytes(), StandardOpenOption.APPEND);
	            } catch (IOException e) {
	                System.err.println("Die file bestaat niet");
	            }
	        });
	    }
}
