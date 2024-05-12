\
class Student{  
int id;  
String name;    
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
Student s1=new Student();  
Student s2=new Student();  
s1.display();  
s2.display();  
}  
}  
class Student1{  
    int id;  
    String name;   
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student1 s1 = new Student1(22051591,"NICE");  
    Student1 s2 = new Student1(22051570,"AKHIL");    
    s1.display();  
    s2.display();  
   }  
}  