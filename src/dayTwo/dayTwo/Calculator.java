package dayTwo.dayTwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) throws FileNotFoundException {
    calculator();
    //    Scanner s1 = new Scanner(new FileInputStream(new File("")));
//    File f = new File("c:\\sdf awf sad ");
  }

  public static void calculator() {    
    Collection<Integer> numbers = getNumbersFromUser();
    int operation = getOperationFromUser();
    int result = calculateOperation(numbers, operation);
    System.out.println("the result is: " + result);
  }
  private static int calculateOperation(Collection<Integer> numbers, int operation) {
    // TODO Auto-generated method stub
    return 0;
  }

  private static int getOperationFromUser() {
   
    return 0;
  }

  public static Collection<Integer> getNumbersFromUser() {
    Scanner scanner = new Scanner(System.in);
    Integer a = 0;
    List<Integer> numbers = new ArrayList<>();
    while (true) {
      System.out.print("type exit to finish of integer number a: ");
      String line = scanner.nextLine().trim();
      if (line.equalsIgnoreCase("exit")) {
        break;
      }
      try {
        a = Integer.parseInt(line);
        numbers.add(a);
      } catch (Exception e) {
        System.out.println(line + " is not a valid integer number");
        System.out.println("please try again or type exit to close");
      } 
    }
    scanner.close();
    return numbers;
  }

  public static Integer calculateSum(Collection<Integer> numbers) {
    int sum = 0;
    for (Integer number : numbers) {
      sum += number;
    }
    return sum;
  }

  public static Integer calculateMultiplication(Collection<Integer> numbers) {
    int multiply = 1;
    for (Integer number : numbers) {
      multiply *= number;
    }
    return multiply;
  }

  public static Integer calculateAvg(Collection<Integer> numbers) {
    return null;
  }

  public static Integer getMin(Collection<Integer> numbers) {
    return null;
  }

  public static Integer getMax(Collection<Integer> numbers) {
    return null;
  }

}
