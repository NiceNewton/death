class student{
int roll;
String name;
student(int r,String n){
roll=r;
name=n;
}
static String college="KIIT";
void display(){
System.out.println(roll+" "+name+" "+college);
}
}
public class student1{
public static void main(String arg[]){
student s1=new student(22051591,"NICE");
student s2=new student(22051570,"AKHIL");
s1.display();
s2.display();
}}
