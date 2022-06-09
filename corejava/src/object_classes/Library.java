package object_classes;
import java.util.Scanner;
public class Library {
	int AccNum;
	String Title;
	String Author;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Accession number:");
		AccNum=sc.nextInt();
		System.out.println("Enter Book Title:");
		Title=sc.nextLine();
		
		System.out.println("Enter Book Author:");
		Author=sc.nextLine();
	}
	void compute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number days late:");
		int days=sc.nextInt();
		int fine=days*5;
		System.out.println("Fine=Rs."+fine);
	}
	void display() {
		System.out.println("Accession number\tTitle\tAuthor");
		System.out.println(AccNum+ "\t" +Title+ "\t\t" +Author);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj=new Library();
		obj.input();
		obj.compute();
		obj.display();
	}
}
