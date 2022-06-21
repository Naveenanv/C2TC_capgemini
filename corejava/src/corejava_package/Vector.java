package corejava_package;
import java.util.*;
public class Vector {

	public static void main(String[] args) 

	{
		// TODO Auto-generated method stub
Stack<String> Stack = new Stack <String>();
Stack .push ("hi");
Stack. push("hello");
Stack .push("bye");
Stack. push ("gm");
Iterator<String>itr = Stack.iterator(); 
while (itr.hasNext())
{
System.out.println(itr.next()+ " ");
	}
	}
}



