import java.util.Scanner;

public class HelloWorld {
    //for cherry peak 1...
    // for chPick 2...
    // Deleted new logic
    public static void main(String[] args) {
        System.out.println("Line in main 1");

        System.out.println("Line in main 2");
        System.out.println("line in branch 1");

        System.out.println("line in branch 2");

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
