package Training;

public class Multiplication 
{
	
	int A=10;
	int B=5;
	int C=10;
	int D=5;
	
	public void multipliation()
	{
		System.out.println(A*B);
		
	}	

	public static void main(String [] args)
	{
		Multiplication c = new Multiplication(); 
		c.multipliation();
		c.Sub();
		c.divide();
		c.add();
	}
	
	public void Sub()
	{
		System.out.println(C-D);
	}
	
	public void divide()
	{
		System.out.println(C/D);
	
	}
	public void add()
	{
		System.out.println(C+D);
	}
}
