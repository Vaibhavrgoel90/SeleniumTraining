package Training;

public class Default {

	
	static String a;
	static String b;
	
	Default(String a, String b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	Default()
	{
		a = "gurdeep";
		b = "vaibhav";
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Default d= new Default();
System.out.println(a);
System.out.println(b);
Default d1= new Default("vaibhav","gurdeep");
Default d2= new Default ("Nikhita","Venus");
}

}
