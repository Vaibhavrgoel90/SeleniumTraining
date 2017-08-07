package Training;

public class methodargument {

	public void add(int a, int b)
	{
		System.out.println(a+b);
		
		}
	
	public void multiply(double a, double b)
	{
		System.out.println(a*b);
	}
	
	public void subtract(double d, double e)
	{
		System.out.println(d-e);
	}
	
	public void divide(double e, double f)
	
	{
		System.out.println(e/f);
	}
	
	
	public static void main(String [] args)
	{
		methodargument a= new methodargument ();
		a.add(4, 5);
		a.add(3,7);		
		a.multiply(2.50, 2.60);
		a.subtract(10,5);
		a.divide(10, 5);
	}
}
