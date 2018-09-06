import java.util.*;
class TestCollection3 extends TestCollection2
{
	Scanner sc = new Scanner(System.in);
	public void collection3()
	{
		System.out.println("\nHere collection with generic");
		System.out.println("Enter data for collection");

		ArrayList<Integer> al = new ArrayList<Integer>();
		//ArrayList<String> al = new ArrayList<String>();
		//ArrayList<Character> al = new ArrayList<Character>();

		LinkedList<Integer> ll = new LinkedList<Integer>();
		//LinkedList<String>ll = new LinkedList<String>();
		//LinkedList<Character> ll = new LinkedList<Character>();

		HashSet<Integer> hs = new HashSet<Integer>();
		//HashSet<String> hs = new HashSet<String>();
		//HashSet<Character> hs = new HashSet<Character>();

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		//LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		//LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

		TreeSet<Integer> ts = new TreeSet<Integer>();
		//TreeSet<String> ts = new TreeSet<String>();
		//TreeSet<Character> ts = new TreeSet<Character>();

		for(int i=0; i<5; i++)
		{
			//String v = sc.next();
			//char v = sc.next().charAt(0);
			int v = sc.nextInt();
			al.add(v);
			ll.add(v);
			hs.add(v);
			lhs.add(v);
			ts.add(v);
		}
		System.out.println(al+"\tArrayList");
		System.out.println(ll+"\tLinkedList");
		System.out.println(hs+"\tHashSet");
		System.out.println(lhs+"\tLinkedHashSet");
		System.out.println(ts+"\tTreeSet");
		System.out.println("size of array list is ");
		System.out.println("For properties of collection go main2 class");
	}
}