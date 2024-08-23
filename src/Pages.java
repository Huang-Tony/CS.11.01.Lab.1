import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner inputage = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = inputage.nextInt();
        int page = 100 - age;
        System.out.println("You should read " + page + " pages.");
    }
}
