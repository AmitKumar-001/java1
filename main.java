import java.io.*;
class main
{
	public static void  main(String[] amit)
	{
		try
		{
			System.out.println("Hello This is IO");
			InputStreamReader sr = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(sr);

			System.out.println("        Read in ---> Write on");
			System.out.println("Enter 1 for cmd ---> cmd");
			System.out.println("Enter 2 for file ---> cmd");
			System.out.println("Enter 3 for cmd ---> file");
			System.out.println("Enter 4 for file ---> file");
			System.out.print("Please Enter Your choice... ");
			String c = b.readLine();
			int ch = Integer.parseInt(c);

			switch(ch)
			{
				case(1):
					TestIO1 io1 = new TestIO1();
					io1.IO1();
					//io1.IO2();
					io1.IO3();
					break;

				case(2):
					TestIO2 io2 = new TestIO2();
					io2.IO1();
					break;

				case(3):
					TestIO3 io3 = new TestIO3();
					io3.IO1();
					break;

				case(4):
					TestIO4 io4 = new TestIO4();
					io4.IO1();
					break;

				default:
					System.out.println("\n********** Your wrong choice **********");
					break;
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("\n********** Sorry wrong choice **********");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}