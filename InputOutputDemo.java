import java.util.Scanner;
public class InputOutputDemo {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");
System.out.print("Enter a decimal number: ");
input.nextLine(); // Consume newline
System.out.printf("Your integer: %d%n", userInt);
System.out.printf("Your decimal number: %.2f%n", userDouble);
System.out.printf("Your string: %s%n", userString);
input.close();



    }
}