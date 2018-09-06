import java.util.*;
class TestCollection4 extends TestCollection3
{
	public void Iterator()
	{
		System.out.println("Here is ParseInt");
		System.out.println("Enter data");

		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		HashSet hs = new HashSet();
		LinkedHashSet lhs= new LinkedHashSet();
		TreeSet ts = new TreeSet();

		for(int i=0; i<5; i++)
		{
			int v = sc.nextInt();
			al.add(v);
			ll.add(v);
			hs.add(v);
	 		lhs.add(v);
			ts.add(v);
		}

		System.out.println(al);

		Iterator<Integer> itral = al.iterator();
		while(itral.hasNext())
		{
			Integer i = itral.next();
			//int x = i*5;
			System.out.print(i*5+" ");
		}
		System.out.println("al");

		Iterator<Integer> itrll = ll.iterator();
		while(itrll.hasNext())
		{
			Integer b = itrll.next();
			System.out.print(b*10+" ");
		}
		System.out.println("ll");

		Iterator<Integer> itrhs = hs.iterator();
		while(itrhs.hasNext())
		{
			Integer b = itrhs.next();
			System.out.print(b*20+" ");
		}
		System.out.println("hs");

		/*Iterator<Integer> itrlhs = lhs.iterator();
		while(itrlhs.hasNext())
		{
			Integer b = itrhs.next();
			System.out.print(b*25+" ");
		}*/
		System.out.println("LinkedHashSet has some proble with Iterator");

		Iterator<Integer> itrts = ts.iterator();
		while(itrts.hasNext())
		{
			Integer b = itrts.next();
			System.out.print(b*30+" ");
		}
		System.out.print("ts");
	}
	
}