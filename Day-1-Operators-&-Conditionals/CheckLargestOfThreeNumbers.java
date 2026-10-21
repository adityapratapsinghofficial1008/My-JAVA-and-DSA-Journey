import java.util.*;
import java.util.Scanner;

public class CheckLargestOfThreeNumbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number: ");
      int a = sc.nextInt();

      System.out.println("Enter the second number: ");
      int b = sc.nextInt();

      System.out.println("Enter the third number: ");
      int c = sc.nextInt();

      if(a>b){
        if(a>c){
          System.out.println("The Number: " + a + " is largest");
        }
      }else if (b>c){
        System.out.println("The Number: " + b + " is largest");
      } else {
        System.out.println("The Number: " + c + " is largest");
      }
    }
}
