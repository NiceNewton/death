import java.util.Scanner;

public class Grade{

    
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        
        System.out.println("Enter marks for subjects:");
        for (int i = 0; i <3; i++){
             System.out.println("Enter marks for subjects"+ (i+1));
            marks[i] = scanner.nextInt();
			sum=sum + mark[i]
		}
		int avg =sum/3;
		
            if (avg >= 90){
                System.out.println("Grade for subjects IS O");
            }
            else if(avg >= 80){
                System.out.println("Grade for subjects is E");
            }
            else if(avg >= 70){
                System.out.println("Grade for subjects is A");
            }
            else if(avg>= 60){
                System.out.println("Grade for subjects is B");
            }
            else if(avg >= 50){
                System.out.println("Grade for subjects is C");
            }
            else if(avg >= 40){
                System.out.println("Grade for subjects is D");
            } 
            else{
                System.out.println("failed");
            } } } 