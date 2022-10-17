//import java.util.Locale;
import java.util.Scanner;
public class BronzeRaids {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String letterToCount;
        checkString();
        System.out.println("What is your word: ");
        word = sc.nextLine();
        System.out.println("What letter do you want to search for in your word: ");
        letterToCount = sc.nextLine();
        checkLetter(word, letterToCount);
    }

    //Bronze-1
    public static void checkString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userString = sc.nextLine();
        if (userString.substring(1,1).compareTo(userString.toLowerCase().substring(1,1)) < 0)
            System.out.println("Your string begins with an uppercase letter");
        else
            System.out.println("Your string begins with lowercase letter");
    }

    public static void checkLetter(String word, String letterToCount){
        // Bronze - 2

        int i = 1;
        int count = 0;
        while (i <= word.length()){
            if (word.substring(i-1,i).compareTo(letterToCount)==0)
                count++;
            i++;
        }
        System.out.println("Your letter " +letterToCount + " appeared in the word "+ word + " " +count + " times");
    }
}
