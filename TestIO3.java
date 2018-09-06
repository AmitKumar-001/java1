import java.io.*;
class TestIO3
{
	public TestIO3()
	{
		System.out.println("\nThis program is Read from cmd and write in a file");
		System.out.println("In this InputStreamReader and BufferedReader and FileWriter has used");
		System.out.println("For write in a file FileWriter and printWrite has used");
	}

	public void IO1()
	{
		System.out.println("\nThis is IO1");
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.print("Enter file name with extension to store data: ");
			String s1 = br.readLine();

			FileWriter fw = new FileWriter(s1);
			PrintWriter pw = new PrintWriter(fw);

			System.out.print("How many lines you want to write: ");
			String nl = br.readLine();
			int l = Integer.parseInt(nl);

			System.out.print("Welcome Enter details that you want to store...\n");
			String d;
			//String d = br.readLine();

			for(int i = 0; i<l; i++)
			{
				
				d = br.readLine();
				pw.println(d);
				//s1 = br.readLine();
			}
			//pw.println(s1);
			pw.flush();		//it save data in file
			pw.close();
		}
		catch(NumberFormatException e)
		{
			System.out.println("\n*********** Sorry number of lines should be integer **********");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}