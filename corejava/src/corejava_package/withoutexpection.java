package corejava_package;

public class withoutexpection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d=0,a;
try {
	a=42/d;
System.out.println("this will not printed");
	}
catch (ArithmeticException e) 
{
	System.out.println("division by zero");
}
System.out.println("this will get printed");
	}
}
