package exception;

class A extends Thread 
{
	public void run()
	{
		for(int i = 1;i<=500;i++)
		{
			System.out.println("\t From thread A:1="+i);
		}
		System.out.println("Exit A");
	}
}

class B extends Thread 
{
	public void run()
	{
		for(int j = 1;j<=500;j++)
		{
			System.out.println("\t From thread B:J="+j);
		}
		System.out.println("Exit B");
	}
}
class C extends Thread 
{
	public void run()
	{
		for(int k = 1;k<=500;k++)
		{
			System.out.println("\t From thread C:K="+k);
		}
		System.out.println("Exit C");
	}
}
public class ThreadExample1
{
	public static void main(String[] args)
	{
		A obA = new A();
		B obB = new B();
		C obC = new C();
		obA.setPriority(5);
		obB.setPriority(10);
		obC.setPriority(1);
		obA.start();
		obB.start();
		obC.start();
		
		
	}
}
