package HomeworkDirectory;

import java.io.File;
import java.io.FileFilter;

public class RecursiveFIleaAndFolder {
	
	
	void listFolder(File dir) {
		File [] subDird = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
			
				return pathname.isDirectory();
			}
		});
		
		System.out.println("\nDirectory of " + dir.getAbsolutePath());
			listFolder(dir);
			
		for (File folder : subDird) {
			listFolder(folder);
			
		}
	}
	
	private void listFile(File dir) {
		File [] files = dir.listFiles();	
		for (File file : files) {
			System.out.println(file.getName());
			
		}
	}

	public static void main(String[] args) {
		new RecursiveFIleaAndFolder().listFile(new File("D:\\Java jdk 8"));
		
		

	}

}
