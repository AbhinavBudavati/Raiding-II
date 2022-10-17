import java.util.Scanner;
import java.lang.Math;
public class IronRaids {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){

        String userEvenOdd;
        System.out.println("Enter a word even or odd?: ");
        userEvenOdd = sc.nextLine();

        //Iron - 1
        EvenOrOdd(userEvenOdd);
    }

    public static void EvenOrOdd(String userEvenOdd){
        System.out.println("Enter a number (1 or 2): ");
        int userNum = sc.nextInt();

        while ((userNum != 1) && (userNum != 2 )) {
            System.out.println("Please enter either 1 or 2: ");
            userNum = sc.nextInt();
        }

        int max = 2;
        int min = 1;
        int range = (max-min) + 1;

        //Math.random() returns between 0.0 and 1.0
        int random = (int)(Math.random() * range) + min;

        int sum = random + userNum;
        System.out.println("Sum of random value and user entered value: " + sum);

        if(sum % 2 == 0 && userEvenOdd.equalsIgnoreCase("even"))
            System.out.println(" You won");
        else
            System.out.println("You lost");
    }
}

