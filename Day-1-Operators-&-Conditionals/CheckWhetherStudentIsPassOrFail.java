import java.util.*;
import java.util.Scanner;

public class CheckWhetherStudentIsPassOrFail {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your over all marks: ");
      int marks = sc.nextInt();

      if(marks >= 45) {
        System.out.println("Congratulations! You are passed. 🥳🥳");
      } else if (marks < 45 && marks >= 0){
        System.out.println("Better Luck Next Time.");
      } else {
        System.out.println("Please re-run the code and provide a valid input.");
      }
    }
}
