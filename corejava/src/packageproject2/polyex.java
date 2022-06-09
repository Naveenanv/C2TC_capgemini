package packageproject2;

public class polyex {
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		b.run();
		//System.out.println()
	}

}
class A
{
	void run()
	{
		System.out.println("hi");
	}
}
class B extends A
{
	void run() {
		System.out.println("hello");
	}
}
