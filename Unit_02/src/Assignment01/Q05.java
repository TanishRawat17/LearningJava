package Assignment01;

import java.util.Scanner;

class Employee
{
	String Name;
	int age;
	String Department;
	int Salary;
	//static int SalA,SalB,SalC,SalD;
	Employee()
	{
		System.out.println("Enter Student Details:");
		Scanner s=new Scanner(System.in);
		System.out.print("Name: ");
		this.Name=s.nextLine();
		System.out.print("Age: ");
		this.age=s.nextInt();
		System.out.print("Department: ");
		this.Department=s.next();
		System.out.print("Salary ");
		this.Salary=s.nextInt();
		if(this.Salary>=30000) this.Salary=25000;
	}
	
	
}
public class Q05 {

	static int sumA=0,sumB=0,sumC=0,sumD=0;
	public static void main(String[] args) {
		Employee array[];
		array=new Employee[8];
		for(int i=0;i<8;i++)
		{
			array[i]=new Employee();
		}
		for(int i=0;i<8;i++)
		{
			
			if(array[i].Department=="A")
			{
				sumA+=array[i].Salary;
			}
			else if(array[i].Department=="B")
			{
				sumB+=array[i].Salary;
			}
			else if(array[i].Department=="C")
			{
				sumC+=array[i].Salary;
			}
			else {
				sumD+=array[i].Salary;
			}
				
		}
		System.out.println("For A: "+sumA);
		System.out.println("For B: "+sumB);
		System.out.println("For C: "+sumC);
		System.out.println("For D: "+sumD);
	}

}