import java.util.Scanner;

public class arrayex{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int[]arr=new int[5];
        try {
            system.out.println("enter number");
			for (int i=0;i<6;i++){
				arr[i]=scanner.nextInt();
        } catch (arrayindexoutoftheboundsexception e) {
            System.out.println("Error: value can only be allowed till size of array.");
        } 
		finally {
            scanner.close();
        }
    }
}