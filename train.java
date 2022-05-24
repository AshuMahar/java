package exception;
class Reserve implements Runnable
{
int available = 1;
int wanted ;
	Reserve (int i)
	{
		wanted = i ;
	}
	
	public void run()
	{
		System.out.println("Number of birth available " + available);
		if(available >= wanted)
		{
			String name =Thread.currentThread().getName();
			System.out.println(wanted + "Berths alloted to " + name);
			try
			{
				Thread.sleep(2000);
				available = available - wanted;
			}
			catch(InterruptedException ie)
			{
				
			}
		}
		else
		{
			System.out.println("Sorry Bhai no births available");
		}
	}
}

public class train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve obj = new Reserve(1);
		Thread t1 = new Thread (obj);
		Thread t2 = new Thread (obj);
		t1.setName("ashu");
		t2.setName("aman");
		t1.start();
		t2.start();
	}

}
