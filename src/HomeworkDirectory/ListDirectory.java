package HomeworkDirectory;

import java.io.File;

public class ListDirectory {

	public static void main(String[] args) {
		print(new File("D:/"));
	}
	
	private static void print(File file) {
		System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				print(f);
			}
		}
		
	}

		
		
		
	
	
}
