package p3;

public class NestedExample {
	private static String str="hi";
	//Static class
	static class MyNestedClass{
	//non-static method
	public void disp(){
	System.out.println(str);
	}
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	NestedExample.MyNestedClass obj = new NestedExample.MyNestedClass();
	obj.disp();

}
}
