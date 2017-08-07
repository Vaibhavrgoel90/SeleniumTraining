package Training;

public class Method {
	
	static  int a = 20;
	int c = 10;
	int d = 30;
	
	public void add()
	
	{
		System.out.println(c+d);
		
	}
	
	public static void main(String [] args)
	{
		Method d = new Method();
		System.out.println(a);
		d.add();
	}

}
