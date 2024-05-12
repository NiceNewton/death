import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String[] elements = {"Java", "is", "fun"};
        String joinedString = String.join("-", elements);
        System.out.println("join(): " + joinedString); 

        boolean isEmpty = str.isEmpty();
        System.out.println("isEmpty(): " + isEmpty);
        String replacedString = str.replace("Java", "Python");
        System.out.println("replace(): " + replacedString);
        String[] splitted = str.split(" ");
        System.out.println("split(): ");
        for (String word : splitted) {
            System.out.println(word);
        }

        String subString = str.substring(5, 9);
        System.out.println("substring(): " + subString);
    }
}
