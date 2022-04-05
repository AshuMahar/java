
public class Student 
{
	int rollno;
	String name;
	String city;
	Student(int r ,String n ,String c)
	{
		rollno = r;
		name   = n;
		city   = c;
	}
public String toString()
	{
		return rollno + " " +name + " " + city;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(101,"Ashu","UKI");
		Student s2=new Student(102,"Ram","CHENNAI");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
