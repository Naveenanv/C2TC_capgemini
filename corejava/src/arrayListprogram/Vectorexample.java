package arrayListprogram;
	import java.util.Vector;

	public class Vectorexample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vector<Integer> vector = new Vector<>();
			vector.add(23);
			vector.add(33);
			vector.add(43);
			vector.add(53);
			vector.add(63);
			System.out.println(vector);

			vector.insertElementAt(14,9);
			System.out.println(vector);
			System.out.println(vector.size());
			 vector.setSize(4);
			 System.out.println(vector.size());
			 System.out.println(vector);
		}
}