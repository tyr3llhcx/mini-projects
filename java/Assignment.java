import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
    // Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String urname = input.nextLine();
        System.out.println("Hey " + urname + ", Welcome to the code !");
    }
}
