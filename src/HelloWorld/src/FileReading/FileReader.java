package FileReading;

import java.io.*;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) {
		
		try {
			
			FileWriter writer = new FileWriter("java_file.txt");
			writer.write("mary had a little lamb");
			writer.close();
			
			File reader = new File("java_file.txt");
			//System.out.println(reader.getAbsolutePath());
			Scanner sc = new Scanner(reader);
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] words = line.split(" ");
				
				for (int i = 0; i < 3; i++) {
					System.out.println(words[i]);
				}
				
			}
			
			sc.close();
			
		}
		catch(IOException e) {
			System.out.println("There was an error in the file.");
			e.printStackTrace();
		}
		
	}
}