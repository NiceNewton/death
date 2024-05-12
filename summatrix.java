import java.util.Scanner;

public class matrix{

    
    public static void main(String arg[]) {
        Scanner max = new Scanner(System.in);
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)			
		{
			for(int j=0;j<3;j++)	
			{
				System.out.println("Enter the value of each Element\n");
				arr[i][j]=max.nextInt();
			}
		}
		for(int i=0;i<3;i++)				
		{
			for(int j=0;j<3;j++)	
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
		
		int count =0;
		int count1=0;
		for(int i=0;i<3;i++)				
		{
			for(int j=0;j<3;j++)	
			{
			if(i==j){
			count=count + arr[i][j];
			}
		 if(i==3-j-1){
			    count1=count1+arr[i][j];
			}
			}
			}
			System.out.println(count);
			System.out.println(count1);
			}}
		
		
		
		
		
	
	