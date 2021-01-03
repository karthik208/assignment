import java.io.*;
class func
{
int over(int a)
{
int s;
s=a*a;
System.out.println("Area of square:"+s);
return 0;
float over(float l, float b)
{
float r;
r=l*b;
System.out.println("area of rectangle:"+r);
return o;
}
double over (double i,double b,double h)
{
double x;
x=l*b*h;
System.out.println("volume of rectangle:"+x);
return 0;
}
}
class overload{
Public static void main(string[] args)
{
func f= new.func();
int a,b,l,h;
DataInputStream br =new DataInputStream(Sysytem.in);
System.out.println("enter the area");
a=Integer.parseInt(br.readLine());
System.out.println("enter the length:");
l=Integer.parseInt(br.readLine());
System.out.println("enter the breadth:");
b=Integer.parseInt(br.readLine());
System.out.println("enter the height:");
h=Integer.parseInt(br.readLine());
f.over(a);
f.over(l,b);
f.over(l,b,h);
}
}
