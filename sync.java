

class A1 extends Thread 
{
	synchronized public void run()
	{
		try
		{
			while(true)
			{
				sleep(1000);
				System.out.println("Good MOrning");
			}
		}
		catch (Exception e)
		{
			
		}
	}
}
class B1 extends Thread 
{
	synchronized public void run()
	{
		try
		{
			while(true)
			{
				sleep(2000);
				System.out.println("Hello");
			}
		}
		catch (Exception e)
		{
			
		}
	}
}
class C1 extends Thread 
{
	synchronized public void run()
	{
		try
		{
			while(true)
			{
				sleep(3000);
				System.out.println("kese ho bhai");
			}
		}
		catch (Exception e)
		{
			
		}
	}
}
public class sync {

	public static void main(String[] args)
	{
		

		A1 obA = new A1();
		B1 obB = new B1();
		C1 obC = new C1();
		obA.setPriority(5);
		obB.setPriority(10);
		obC.setPriority(1);
		obA.start();
		obB.start();
		obC.start();
	}

}
