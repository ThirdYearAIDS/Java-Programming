package PureReading;

import java.io.*;
import java.util.Scanner;

public class PureReader {
	public static void main(String[] args) {
		
		try {
			
			FileWriter writer = new FileWriter("output_file.txt");
			File reader = new File("reading_file.txt");
			//System.out.println(reader.getAbsolutePath());
			Scanner sc = new Scanner(reader);
			
			int count = 0;
			
			while (count < 2) {
				String line = sc.nextLine();
				String[] words = line.split(" ");
				
				for (int i = 0; i < 3; i++) {
					writer.write(words[i] + " ");
				}
				
				count++;
				
			}
			
			writer.close();
			System.out.println("Output saved in a separate file.");
			
			sc.close();
			
		}
		catch(IOException e) {
			System.out.println("There was an error in the file.");
			e.printStackTrace();
		}
		
	}
}