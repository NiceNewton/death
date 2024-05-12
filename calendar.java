import java.util.Scanner;
class week{
	public static void main(String arg[]){
		Scanner cal=new Scanner(System.in);
		System.out.print("Enter date");
		int DATE=cal.nextInt();
		
		DATE = DATE%7;
		
		
		switch (DATE) {
			case 1:
				System.out.println("MONDAY");
				break;
			case 2:	  
				System.out.println("TUESDAY " );
				break;
			case 3:
				System.out.println("WEDNESDAY" );
				break;
			case 4:	  
				System.out.println("THURSDAY");
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6 :
				System.out.println("SATURDAY");
				break;
			case 7:
				System.out.println("SUNDAY");
				break;
			default:
				System.out.println("wrong input");
				break;
		}
	}
}
