package Training;

public class LocalGlobal {
	
	String a = "vaibhav Goel"; // Global Variable
static String b = "Quality Engineer";//static global Variable

public static void main(String [] args)

{
	int c=10;//Local Variable
	
	LocalGlobal abc=new LocalGlobal();// Class Object( include Class Name)
	System.out.println(abc.a); //to access non static variable by creating object of class
	System.out.println(b); // to access static variable without creating object of class
	System.out.println(c);

	
}

}
