import java.util.Scanner;

class Telcall
{
		long phno;
		String name;
		int n;
		double amt;
		Telcall(long x,String y , int z)
		{
			phno=x;
			name=y;
			n=z;//no of calls			
		}
		void compute()
		{
			if(n<=100)
			{
				amt=500;
			}
			else if(n>100 && n<=200)
			{
				amt= (n-100)+500;			
			}
			else if(n>200 && n<=300)
			{
				amt= 100+500+(n-200)*1.20;			
			}
			else if(n>300)
			{
				amt= 100+120+500+(n-300)*1.50;			
			}
		}
		void display()
		{	 
			 System.out.println("User Name:"+name);
		         System.out.println("User Phone Number:"+phno);
			 System.out.println("Total No of calls:"+n);
			 System.out.println("Total Bill:"+amt);			 	
		}
}

class Billcount
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter User Name:");
		String a=sc.nextLine();
		System.out.println("Enter User Phone Number:");
		long b=sc.next();
	        System.out.println("Enter Total No of calls made:");		
		int c=sc.nextInt();
		Telcall data = new Telcall(b,a,c);
		data.compute();
		data.display();


	}
}























