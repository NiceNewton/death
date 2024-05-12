
import java.util.Scanner;
public class EVOD {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        int cout1=0,cout2=0,sumEV=0,sumOD=0,total=0;
        System.out.println("Number of elements");
        int N= tec.nextInt();
        int []arr= new int[N];
        
        System.out.println("enter the elements");
        for (int i=0;i<N;i++){
        arr[i]= tec.nextInt();
        
        if (arr[i]%2==0){
            sumEV=sumEV+arr[i];
            cout1++;
        }
        else if (arr[i]%2!=0){
            sumOD=sumOD+arr[i];
            cout2++;
        }
        }
         System.out.println( "sum of even numbers : "+sumEV);
          System.out.println("sum of odd numbers :  "+sumOD);
           System.out.println("no of even numbers :  "+cout1);
         System.out.println(" no of odd numbers :  "+cout2);
        for (int i=0;i<N;i++){
            total=total+arr[i];
        }
         System.out.println("grand total :  "+total);
    }
}