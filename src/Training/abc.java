package Training;

public class abc {
static int s;
String a;
double b;

abc(int s,String a) //constructor with arguments
{
	this.s=s;
	this.a=a;
	System.out.println(this.s);
	System.out.println(this.a);
}

abc()//constructor without arguments
{
	s=10;
	a="Vaibhav";
	b=20.0;
System.out.println("Construtor");
System.out.println(s);
System.out.println(a);
}
public static void main(String args [])
{
	abc e= new abc();
	abc e1=new abc(2, "Gurdeep");
	abc e2=new abc(3, "Vaibhav");
	
}
}
