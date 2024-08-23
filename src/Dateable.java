import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner inputage = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = inputage.nextInt();
        int newage = age/2 + 7;
        System.out.println("The youngest person you can date is: " + newage);

    }
}
