import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {

        Scanner inputName = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = inputName.nextLine();

        System.out.printf("Hello %s", name);
    }
}
