package HomeworkAlgorithms;
import java.util.Scanner;

public class MultipleLines {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        StringBuilder strBuilder = new StringBuilder();

	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            if (!line.equals("done")) {
	                strBuilder.append(line + System.lineSeparator());
	            } else {
	                break;
	            }
	        }
	        System.out.println(strBuilder.toString());
	        
	        System.out.println("Enter a single word : ");
	        String str = scanner.nextLine();
	        System.out.println(countWords(str, str));
	    
	        }
	        
	 
	 static int countWords(String str, String word) {
		 String w [] = str.split(" ");
		 int count = 0;
		 for (int i = 1; i < w.length; i++) {	
		}
		 int i = count;
		if (word.equals(w[i]))
			 count ++;
	 
	       return count;
	 
		 
	 }
	        
	    }
	

