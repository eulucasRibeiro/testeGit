import java.util.Scanner;

public class index {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.print ("Enter a number: ");
    scanner.nextInt();

    if (number < 1) {
        System.out.println("The number is negative");
    } else if (number == 0) {
        System.out.println("The number is zero");
    } else {
        System.out.println("The number is positive");
    }
    }


}