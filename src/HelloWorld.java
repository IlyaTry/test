import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        int randomNumber = (int) (Math.random() * 101);

        while (number != randomNumber) {

            System.out.println("One more try...");
            number = scanner.nextInt();
        }
        System.out.println("Yep, it's " + randomNumber);
    }
}
