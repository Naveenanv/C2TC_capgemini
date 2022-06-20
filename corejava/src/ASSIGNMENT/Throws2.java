package ASSIGNMENT;
import java.io.IOException;
public class Throws2
{
	static void display()throws IOException
	{
		System.out.println("Hello java");
		throw new IOException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws2 obj=new Throws2();
		try 
		{
			obj.display ();
		}
		catch(IOException e) 
		{
			System.out.println("caught an exception:\n"+e);
		} 


	}

}
