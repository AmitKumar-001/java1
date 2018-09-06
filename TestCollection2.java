import java.util.*;
class TestCollection2
{
	Scanner sc = new Scanner(System.in);
	public void collection2()
	{
		System.out.println("\nCollection will be start.");
		System.out.println("Enter data for collection: ");

		ArrayList al = new ArrayList();
		//HashList hl = new HashList();
		LinkedList ll = new LinkedList();
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts = new TreeSet();

		for(int i=0; i<5; i++)
		{
			int v=sc.nextInt();
			al.add(v);
			//hl.add(v);
			ll.add(v);
			hs.add(v);
			lhs.add(v);
			ts.add(v);
			//System.out.print("\r");
		}
		
		/*LinkedList ll = new LinkedList();
		for(int i=0; i<5; i++)
		{
			int v=sc.nextInt();
			ll.add(v);
			//System.out.println("linked list");
		}*/

		System.out.println("\tLIST");
		System.out.println("List allow duplicate");
		System.out.println("\nArrayList add data based on array index position.");
		System.out.println(al+"\tArrayList");

		//System.out.println("\nHashList add data based on array index position.");
		//System.out.println(hl+"\tHashList");

		System.out.println("\nLinkedList add data based on address of previous element.");
		System.out.println(ll+"\tLinkedList");

		System.out.println("\n\tSET");
		System.out.println("Set does not allow duplicate");
		System.out.println("\nHashSet neither ordered nor sorted.");
		System.out.println(hs+"\tHashSet");

		System.out.println("\nLinkedHashSet ordered but not sorted");
		System.out.println(lhs+"\tLinkedHashSet");

		System.out.println("\nTreeSet both ordered and sorted");
		System.out.println(ts+"\tTreeSet");

		System.out.println("\nNote:- SORTED means assending or dessindig\n       ORDERED same as input.");
		System.out.println("       For generic go main3 class.");
		System.out.println("\t\tThank You");
	}
	
}