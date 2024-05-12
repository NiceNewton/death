import java.util.Scanner;

public class StringProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to reverse the string");
            System.out.println("Enter 2 to change the case of the string");
            System.out.println("Enter 3 to compare two strings");
            System.out.println("Enter 4 to insert one string into another string");
            System.out.println("Enter 5 to check if a character is present in the string");
            System.out.println("Enter 6 to convert the string to upper and lower case");
            System.out.println("Enter 7 to check the number of words, vowels and consonants in the string");
            System.out.println("Enter 8 to check if the string is a palindrome");
            System.out.println("Enter 9 to exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a string to reverse:");
                    String str = scanner.nextLine();
                    System.out.println("Reversed string: " + reverseString(str));
                    break;
                case 2:
                    System.out.println("Enter a string to change case:");
                    str = scanner.nextLine();
                    System.out.println("Changed case string: " + changeCase(str));
                    break;
                case 3:
                    System.out.println("Enter two strings to compare:");
                    String str1 = scanner.nextLine();
                    String str2 = scanner.nextLine();
                    System.out.println("Comparison result: " + compareStrings(str1, str2));
                    break;
                case 4:
                    System.out.println("Enter two strings:");
                    str1 = scanner.nextLine();
                    str2 = scanner.nextLine();
                    System.out.println("String after insertion: " + insertString(str1, str2));
                    break;
                case 5:
                    System.out.println("Enter a string and a character:");
                    str = scanner.nextLine();
                    char ch = scanner.next().charAt(0);
                    System.out.println("Character found at index: " + checkCharacter(str, ch));
                    break;
                case 6:
                    System.out.println("Enter a string:");
                    str = scanner.nextLine();
                    System.out.println("Uppercase string: " + convertToUpperCase(str));
                    System.out.println("Lowercase string: " + convertToLowerCase(str));
                    break;
                case 7:
                    System.out.println("Enter a string:");
                    str = scanner.nextLine();
                    int[] wordCount = countWordsVowelsConsonants(str);
                    System.out.println("Word count: " + wordCount[0]);
                    System.out.println("Vowel count: " + wordCount[1]);
                    System.out.println("Consonant count: " + wordCount[2]);
                    break;
                case 8:
                    System.out.println("Enter a string:");
                    str = scanner.nextLine();
                    System.out.println("Is palindrome: " + checkPalindrome(str));
                    break;
                case 9:
                    System.out.println("Exiting program");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String changeCase(String str) {
        if (str.equals(str.toUpperCase())) {
            return str.toLowerCase();
        } else {
            return str.toUpperCase();
        }
    }

    public static int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static String insertString(String str1, String str2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position to insert the second string:");
        int index = scanner.nextInt();
        return new StringBuilder(str1).insert(index, str2).toString();
    }

