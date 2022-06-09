package p3;

public class StaticMethodEx {
	//static variable
		static int j=100;
		
		//instance variables
		int n=200;
		
		//static method
		static void a()
		{
			int a=200;
			System.out.println("Print from a");
			
			//cannot make a static reference to the non-static field b
			
			//n=100;//compiler error
			//cannot make a static reference to the nonstatic method a2(} from the type Test
			//a2();//compilation error
			//System.out.println(super.j);
		}
		//instance method
		void a2()
		{
			System.out.println("inside a2");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StaticMethodEx ob1=new StaticMethodEx();
			ob1.a2();
			StaticMethodEx.a();
		}
}
