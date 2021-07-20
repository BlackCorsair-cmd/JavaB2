package HomeworkAlgorithms;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseNumbers {
	
	public static void main(String[] args) {
	
	List<String> out = new ArrayList<String>();

    try {
        Scanner console = new Scanner (System.in);
        System.out.println("This numbers :  ");
        String input = console.nextLine().trim();
        out.add(input);

        while (!input.equals("exit")){ 
            input = console.next();
            out.add(input);
        }
        }catch (Exception e){
            System.out.println(" Error! ");
        }

        for(int i = out.size() - 1; i >=0; i--){
            System.out.print(out.get(i));
        }

        System.out.print(" Finish "); 
}
}
