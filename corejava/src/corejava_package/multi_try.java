package corejava_package;

public class multi_try {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String st="welcome";
		int x[]= {0,1,2,3};
		try {
			int slength=st.length();
			System.out.println("string length:"+slength);
		try {
			int y=6;
			System.out.println(x[y]);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("exception is thrown");
			System.out.println(e.toString());
		}
	}
	catch(ArrayIndexOutOfBoundsException ae)	
		
	{
	System.out.println("exception is thrown");
	System.out.println(ae.toString());
	}
	System.out.println("i am other catch block");
		}
}