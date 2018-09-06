import java.io.*;
class TestIO1
{
	public TestIO1()
	{
		System.out.println("\nThis program is Read from cmd and write on cmd");
		System.out.println("In this IputStreamReader and BufferedReader has used");
		System.out.println("For write on cmd use System.out.print(\" \")");
	}
	public void IO1()
	{
		System.out.println("\nThis is IO1.");
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Enter first Line: ");
			String str1 = br.readLine();
			System.out.print("Enter second Line: ");
			String str2 = br.readLine();
			System.out.println("Wellcome "+str1+" "+str2);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	/*public void IO2()	//What can use inplace of .readLine with InputStreamReader
	{
		System.out.println("\nThis is IO2");
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			System.out.print("Enter some: ");
			String str1 = isr.readLine();
			System.out.println(str1+" has entered by you");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/

	public void IO3()
	{
		System.out.println("\nThis is IO3.");
		try
		{
			int a,b,c;
			String s1,s2;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Enter first number: ");
			s1 = br.readLine();
			a = Integer.parseInt(s1);
			System.out.print("Enter second number: ");
			s2 = br.readLine();
			//a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
			c = a/b;
			System.out.println(a+"/"+b+"="+c);
		}
		catch(NumberFormatException e)
		{
			System.out.println("All data should be integer *************\n");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second number can't be zero ************\n");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}