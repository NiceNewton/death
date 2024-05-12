import java.util.Scanner;

public class Grade{

    
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int N= scanner.nextInt();
        int  [] marks = new int[N];
        System.out.println("Enter marks for subjects:");
        for (int i = 0; i <N; i++){
             System.out.println("Enter marks for subjects"+ (i+1));
            marks[i] = scanner.nextInt();
            if (marks[i] >= 90){
                System.out.println("Grade for subject IS O");
            }
            else if(marks[i] >= 80){
                System.out.println("Grade for subject is E");
            }
            else if(marks[i] >= 70){
                System.out.println("Grade for subject is A");
            }
            else if(marks[i] >= 60){
                System.out.println("Grade for subject is B");
            }
            else if(marks[i] >= 50){
                System.out.println("Grade for subject is C");
            }
            else if(marks[i] >= 40){
                System.out.println("Grade for subject is D");
            } 
            else{
                System.out.println("Grade for subject is F");
            } } } }