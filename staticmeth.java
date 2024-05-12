class Student{  
     int rollno;  
     String name;  
     static String college = "KIIT";   
     static void change(){  
     college = "KIIT";  
     }  
     Student(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
public class StaticMethod{  
    public static void main(String args[]){  
    Student.change();
    Student s1 = new Student(22051591,"NICE");  
    Student s2 = new Student(22051644,"SWASTIKA");  
    Student s3 = new Student(22051570,"AKHIL");   
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  