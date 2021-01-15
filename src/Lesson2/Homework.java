package Lesson2;

import java.util.Scanner;

public class Homework {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Решение квадратного уравнения");

    double a = readDouble("a");
    double b = readDouble("b");
    double c = readDouble("c");

    if (a != 0 && b != 0 && c != 0) {
      double discriminant = Math.pow(b, 2) - 4 * a * c;
      if (discriminant > 0) {
        System.out.println(
          "X1 = " + ((-b + Math.sqrt(discriminant)) / (2 * a))
        );
        System.out.println(
          "X2 = " + ((-b - Math.sqrt(discriminant)) / (2 * a))
        );
      } else if (discriminant == 0) {
        System.out.println("X1 = " + firstRootOfEquation(a, b, discriminant));
      } else {
        System.out.println("Уравнение не имеет корней");
      }
    } else if (a == 0) {
      System.out.println("X = " + (-c / a));
    } else if (b == 0) {
      if (-c / a < 0) {
        System.out.println("Уравнение не имеет корней");
      } else {
        System.out.println("X1 = " + (Math.sqrt(-(c / a))));
        System.out.println("X2 = " + (-Math.sqrt(-(c / a))));
      }
    } else {
      System.out.println("X1 = " + 0);
      System.out.println("X2 = " + (-b / a));
    }
  }

  public static double readDouble(String name) {
    System.out.println("Enter " + name + ":");
    return scanner.nextDouble();
  }

  public static double firstRootOfEquation(
    double a,
    double b,
    double discriminant
  ) {
    return (-b + Math.sqrt(discriminant)) / (2 * a);
  }

  public static double secondRootOfEquation(
    double a,
    double b,
    double discriminant
  ) {
    return (-b - Math.sqrt(discriminant)) / (2 * a);
  }
}
