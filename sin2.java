
package exception;
class MyThread1 implements Runnable
{
public void run()
{
	task1();
	task2();
	task3();

}
void task1()
{	
		
	System.out.println("This is task 1");
}
void task2()
{
	System.out.println("This is task 2");
}
void task3()
{	
	System.out.println("This is task 3");
}
}

public class sin2 
{
	public static void main(String[] args)
	{
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}

