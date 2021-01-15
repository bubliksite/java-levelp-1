package Lesson2;

import java.util.Scanner;

public class MyProgram {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    //    int a = readInt("a");
    //    int b = readInt("b");
    //    int sum = a + b;
    //    System.out.println("Sum: " + sum);
    //
    //    int x = readInt(a);
    //
    //    Woman woman = new Woman();
    //    System.out.println("Woman: " + woman);

    System.out.println("Enter line:");
    String line = scanner.nextLine();
    int result = 0;
    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      if (ch >= '0' && ch <= '9') {
        String numberAsText = line.substring(i);
        result = Integer.parseInt(numberAsText);
        break;
      }
    }
    System.out.println("result is: " + result);
  }

  public static int readInt(int number) {
    return readInt(String.valueOf(number));
  }

  public static int readInt(String name) {
    System.out.println("Enter " + name + ":");
    return scanner.nextInt();
  }

  static class Woman {

    int age = 30;

    @Override
    public String toString() {
      return "age: " + age;
    }
  }
}
