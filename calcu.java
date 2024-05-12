import java.util.Scanner;
class calcu{
public static void main(String arg[]){
	Scanner cal= new Scanner(System.in);
	 System.out.println("first number");
        int num1= cal.nextInt();
         System.out.println("second number");
        int num2= cal.nextInt();
         System.out.println("MENU");
          System.out.println("ARITHMETIC OPERATION"); 
          System.out.println("1 - FOR ADDITION");
           System.out.println("2 - FOR SUBTRACTION");
            System.out.println("3 - FOR MULTIPLICATION");
             System.out.println("4 - FOR DIVISION");
             while(true){
              System.out.println("ENTER THE VALUE");
		int operation=cal.nextInt();
		 switch (operation) {
      case 1:
        System.out.println("sum of the entered numbers : " + (num1+num2));
        break;
      case 2:
        System.out.println("diffrence of the entered numbers : " + (num1-num2));
        break;
      case 3:
        System.out.println("product of the entered numbers : " + num1*num2);
        break;
      case 4:
        System.out.println("quotient the entered numbers : "+  num1/num2);
        
        break;
		default:
        System.out.println("wrong input");
		break;
		 }
             }	
}
}
		
