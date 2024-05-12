class plate {
float length,width;
plate(float l,float w){
length=l;
width=w;
System.out.println("From plate const- ");
}
}
class box extends plate{
float height;
box(float l,float w, float h){
super(l,w);
height=h;
System.out.println("From box const- ");
}
}
class woodbox extends box{
float thick;
woodbox(float l,float w, float h,float t){
super(l,w,h);
thick=t;
System.out.println("From woodbox const- ");
}
}
class supercon {
public static void main (String args[]){
woodbox mybox= new woodbox(20,12,6,3);
System.out.println("Box's length is : "+mybox.length);
System.out.println("Box's width is : "+mybox.width);
System.out.println("Box's height is : "+mybox.height);
System.out.println("Box's thickness is : "+mybox.thick);
}
}
