import java.io.*;
class TestIO4
{
	public TestIO4()
	{
		System.out.println("\nThis program is Read from a File and write in another File");
		System.out.println("In this FileReader and BufferedReader and FileWriter and println has used");
		System.out.println("For Write in a file FileWriter and printWriter has used");
		System.out.println("For Read from file FileReader and BufferedReader has used");
	}

	public void IO1()
	{
		System.out.println("\nTis is IO1 from TestIO4");
		//String f;
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(isr);

			System.out.print("Enter name of file with extension to read: ");
			String f1 = b.readLine();
			//f = f1;
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String d = br.readLine();

			System.out.print("Enter name of file with extension in which data will stored: ");
			String f2 = b.readLine();
			FileWriter fw = new FileWriter(f2);
			PrintWriter pw = new PrintWriter(fw);
			
			if(d == null)
			{
				System.out.println("\t\t!!!!! Task Completed !!!!!");
				System.out.println("\n************** Sorry "+f1+" is an empty file. **************");
			}
			else
			{
				while(d != null)
				{
					pw.println(d);
					d = br.readLine();
				}
				pw.flush();
				pw.close();
				System.out.println("\n\n!!!!! Task Completed !!!!!");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("\n************** Sorry this file does not exist. **************");
			//e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}