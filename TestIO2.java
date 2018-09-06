import java.io.*;
class TestIO2
{
	public TestIO2()
	{
		System.out.println("\nThis program is Read from FILE and write on CMd");
		System.out.println("In this FileReader and BufferedReader has used");
		System.out.println("For Read from file FileReader has used");
	}

	public void IO1()
	{
		System.out.println("\nThis is IO1.");
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br1 = new  BufferedReader(isr);
			System.out.print("Enter file name with extension or directory to read at consol: ");
			String fn = br1.readLine();	//this is io from cmd

			FileReader fr = new FileReader(fn);
			BufferedReader br = new BufferedReader(fr); //this if io from file
			String s1 = br.readLine();
			if(s1 == null)
			{
				System.out.println("\n!!!!!Sorry this is an empty file. **************************");
			}
			else
			{
				System.out.println("Your file will start from next line...\n");
				while(s1 != null)
				{
					System.out.println(s1);
					s1 = br.readLine();
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("\n\t\t!!!Sorry!!!\nThis file does not exit at this directory ************\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}