import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        int randomNumber = (int) (Math.random() * 101);

        int couter = 0;

        while (number != randomNumber) {
            if (number > randomNumber) {
                System.out.println("It's less");
            } else {
                System.out.println("It's bigger");
            }
            System.out.println("One more try...");
            couter++;
            number = scanner.nextInt();
        }
        System.out.println("Yep, it's " + randomNumber);
        System.out.println("Number of attempts = " + couter);
    }
}
