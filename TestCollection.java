import java.util.*;
class TestCollection
{
	public static void main(String[] args)
	{	
		System.out.println("Data entered as \t10, 20, 30, 5, 15, 30");
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(5);
		a1.add(15);
		a1.add(30);
		System.out.print("This is ArrayList:\t");
		System.out.println("\b"+a1+"List");

		LinkedList a2 = new LinkedList();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(5);
		a2.add(15);
		a2.add(30);
		System.out.print("This is LinkedList:\t");
		System.out.println("\b"+a2+"List");

		HashSet a3 = new HashSet();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		a3.add(5);
		a3.add(15);
		a3.add(30);
		System.out.print("This is HsahSet:\t");
		System.out.println("\b"+a3+"Set");
	
		LinkedHashSet a4 = new LinkedHashSet();
		a4.add(10);
		a4.add(20);
		a4.add(30);
		a4.add(5);
		a4.add(15);
		a4.add(30);
		System.out.print("This is LinkedHashSet: ");
		System.out.println(a4+"Set");

		TreeSet a5 = new TreeSet();
		a5.add(10);
		a5.add(20);
		a5.add(30);
		a5.add(5);
		a5.add(15);
		a5.add(30);
		System.out.print("This is TreeSet: \t");
		System.out.println("\b"+a5+"Set");
	}
}