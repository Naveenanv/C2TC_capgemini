package ASSIGNMENT;
import java.util.Scanner;navee
public class commission {
	String name;
	String address;
		long phone;
		float sales_amount;
		float commission_amount=0;
		Scanner scan = new Scanner(System.in);
		commission()
		{
			System.out.println("Enter your Name: ");
		    name = scan.nextLine();
			System.out.println("Enter your Address: ");
			address = scan.nextLine();
			System.out.println("Enter your Phone Number: ");
			phone = scan.nextLong();
		}
		float calculation()
		{
			System.out.println("Enter the Sales Amount: ");
			sales_amount = scan.nextFloat();
			if(sales_amount>=100000)
			{
				commission_amount = (10/100)*sales_amount;
				System.out.println("The commission amount is: "+commission_amount);
			}
			else if(sales_amount>=50000&&sales_amount<100000)
			{
				commission_amount = (5/100)*sales_amount;
				System.out.println("The commission amount is: "+commission_amount);
			}
			else if(sales_amount>=30000&&sales_amount<50000)
			{
				commission_amount = (3/100)*sales_amount;
				System.out.println("The commission amount is: "+commission_amount);
			}
			else
			{
				System.out.println("No commission");
			}
			return commission_amount;
		}
		void display()
		{
			System.out.println("NAME \t ADDRESS \t PHONE NUMBER\t SALES AMOUNT\t COMMISSION AMOUNT");
			System.out.println(name+" \t"+address+"  \t"+phone+ " \t "+sales_amount+ " \t " +commission_amount+"\t");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			commission cm = new commission();
			cm.calculation();
			cm.display();
		}

	}
