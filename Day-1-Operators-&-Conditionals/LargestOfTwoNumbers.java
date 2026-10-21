import java.util.*;
import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number: ");
      int num1 = sc.nextInt();

      System.out.println("\nEnter the second number: ");
      int num2 = sc.nextInt();

      if(num1 != num2){
        if(num1 > num2){
          System.out.println("\nLargest number is: " + num1);
        } else {
          System.out.println("\nLargest number is: " + num2);
        }
      } else {
        System.out.println("\nBoth are same.");
      }
    }
}
