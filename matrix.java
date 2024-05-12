import java.util.Scanner;

public class matrix{

    
    public static void main(String arg[]) {
        Scanner max = new Scanner(System.in);
		int arr[][];
		int row;
		int colm;
		System.out.println("enter the size of the row");;
		row=max.nextInt();

		System.out.println(" enter the size of the column");;
		colm=max.nextInt();
		arr=new int[row][colm];
		for(int i=0;i<row;i++)			
		{
			for(int j=0;j<colm;j++)	
			{
				System.out.println("Enter the value of each Element\n\n");
				arr[i][j]=max.nextInt();
			}
		}
		for(int i=0;i<row;i++)				
		{
			for(int j=0;j<colm;j++)	
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
	}
	}