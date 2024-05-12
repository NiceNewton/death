import java.util.Scanner;
abstract class student{
int rollno;
String regno;
public void getinput(){
Scanner scan=new Scanner(System.in);
System.out.println("roll no :");
rollno =scan.nextInt();
regno=scan.nextLine();
}
abstract String course();
}
class kiitian extends student{
String course(){
return" B.tech(Computer Science & Engg)";
}}
public class Driver{
public static void main(String arg[]){
kiitian student=new kiitian();
System.out.println("ROLL NO: "+ student.rollno);
System.out.println("REGISTRATION NO : " + student.regno);
System.out.println("COURSE : "+ student.course());
}
}