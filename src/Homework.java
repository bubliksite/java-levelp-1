import java.util.Scanner;

public class Homework {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a: ");
    float a = scanner.nextFloat();

    System.out.println("Enter b: ");
    float b = scanner.nextFloat();

    System.out.println("X equal: ");
    System.out.println((-b / a));
  }
}
