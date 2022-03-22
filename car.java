import java.util.Scanner;
class car
{
	public static void main (String args[])
	
	{
	  int choice ;
     	  int survey[][]=new int[4][4];		
	  Scanner sc = new Scanner(System.in);
	  for( int i=0;i<4;i++)
	  { 
	     for(int j= 0;j<4;j++)
	     {
		survey[i][j]=0;
             }
	  }
	 int city;
	 int cars;
	 
	 do{
	        System.out.println("*******Menu*********");
	        System.out.println("Press 1 for DELHI");
                System.out.println("Press 2 for MUMBAI");		 	
		System.out.println("Press 3 for KOLKATA");
		System.out.println("Press 4 for CHENNAI");
		System.out.println("Press 0 for K-10");
		System.out.println("Press 1 for ZEN-ASTELO");
		System.out.println("Press 2 for WAGON R");
		System.out.println("Press 3 for SX-4");
		System.out.println("ENTER THE CITY CODE ");
		city=sc.nextInt();		
		System.out.println("ENTER CAR CODE");
		cars=sc.nextInt();
		survey[city][cars]++;
		System.out.println("Do you want to continue 1 for yes 0 for No");
		
		choice=sc.nextInt();
	}			
		while(choice==1);
 		System.out.println("\t        K-10\t ZEN ASTELO\t WAGONR\t SX-4");
		for(int i=0;i<4;i++)
		{
		  if(i==0)
		  System.out.print("Delhi");

		  else if(i==1)
		  System.out.print("Munbai");

		  else if(i==2)
		  System.out.print("Kolkata");
		  
		  else
		  System.out.print("Chennai");
		
		for(int j=0;j<4;j++)
		 {
		  System.out.print("        "+survey[i][j]+"\t");
		 }

		  System.out.println();
	}
}   }		





		



























