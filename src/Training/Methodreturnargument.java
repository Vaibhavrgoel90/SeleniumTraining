package Training;

public class Methodreturnargument {
	
	public double add(double a,double b)
	{
		return (a+b);
	}

	public double sub(double c,double d)
	{
		return(c-d);
	}
	
	public double multiply(double e,double f)
	{
		return(e*f);
	}
	
	public double divide(double g,double f)
	{
		return(g/f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Methodreturnargument a= new Methodreturnargument();
        System.out.println(a.add(5, 5));
        System.out.println(a.sub(10,5));
        System.out.println(a.multiply(10, 10));
        System.out.println(a.divide(10, 2));
	}

}
