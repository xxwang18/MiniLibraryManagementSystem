package LibrarySystem.utils;

import java.io.*;
import java.util.List;

public class FileHandler {
	public static void saveTextFile(String filePath, List<String> lines) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
			for (String line: lines) {
				writer.write(line);
			}
			System.out.println("File saved to: "+filePath);
		}catch(IOException e) {
			System.out.println("Error saving file: " +e.getMessage());
		}
	}
	public static List<String> loadTextFile(String filePath){
		try {
			return java.nio.file.Files.readAllLines(java.nio.file.Paths.get(filePath));
		}catch(IOException e) {
			System.out.println("Error reading files: " + e.getMessage());
			return java.util.Collections.emptyList();
		}
	}
}
