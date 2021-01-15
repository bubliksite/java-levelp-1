package Lesson1;

import java.util.Scanner;

public class MyProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a: ");
    int a = scanner.nextInt();

    System.out.println("Enter b: ");
    int b = scanner.nextInt();

    System.out.println("Sum: ");
    System.out.println(a + b);
  }
}
