import java.util.Scanner;

public class HelloWorld {

    // Something more in logic.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        int randomNumber = (int) (Math.random() * 101);

        int couter = 0;

        while (number != randomNumber) {
            if (number > randomNumber) {
                if (number - randomNumber >= 50){
                    System.out.println("It's LESS, dif more than 50");
                }else if (number - randomNumber <= 50){
                    System.out.println("It's LESS, dif less than 50");
                }else if (number - randomNumber <= 30){
                    System.out.println("It's LESS, dif less than 30");
                }else if (number - randomNumber <= 10){
                    System.out.println("It's LESS, dif less than 10");
                }
            } else {
                if (randomNumber - number >= 50){
                    System.out.println("It's BIGGER, dif more than 50");
                }else if (randomNumber - number <= 10){
                    System.out.println("It's BIGGER, dif less than 10");
                }else if (randomNumber - number <= 30){
                    System.out.println("It's BIGGER, dif less than 30");
                }else if (randomNumber - number <= 50){
                    System.out.println("It's BIGGER, dif less than 50");
                }
            }
            System.out.println("One more try...");
            couter++;
            number = scanner.nextInt();
        }
        System.out.println("Yep, it's " + randomNumber);
        System.out.println("Number of attempts = " + couter);
    }
}
