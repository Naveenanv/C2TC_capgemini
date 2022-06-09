package polymorphism;
import java.util.Scanner;
public class volume {
	void cube(int s) {
		System.out.println("volume of cube "+s+" is"+s*s);
	}
	void cuboid(int l,int b,int h){
		System.out.println("volume of cubiod is "+l*b*h);
	}
	void sphere(int r) {
		System.out.println("volume of sphere is "+((4/3)*3.14*(r*r*r)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume obj=new volume();
		obj.cube(3);
		obj.cuboid(2, 3, 4);
		obj.sphere(5);
	}
}
