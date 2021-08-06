package GuruSchools.GuruSchools_Maven;

import org.testng.annotations.Test;

public class TestNGDemo2 {

	int add,sub;
	@Test (priority=-1,groups="Regression")//It is annotation in TestNG
	public void TC1()
	{
		System.out.println("Welcome to test case 1");	
		int i= sum(1,2);
		System.out.println("Value of i is "+i);
	}
	
	@Test (priority=1, groups="smoke")//It is annotation in TestNG
	public void TC2()
	{
		System.out.println("Welcome to test case 2");	
		sum(10,20);
	}
	
	@Test (priority=1, groups="smoke")//It is annotation in TestNG
	public void TC3()
	{
		System.out.println("Welcome to test case 3");	
		subtract(1324,2230);//calling subtract method
	}
	public int sum(int x,int y) //Its method to add 2 numbers
	{
		add = (x+y);
		System.out.println("Addition of two numbers "+ add);
		return (x+y);
	}
	
	public int subtract(int x,int y) //Its method to add 2 numbers
	{
		sub = (x-y);
		System.out.println("Subtraction of two numbers "+ sub);
		return sub;
	}
	
	@Test (priority=2)
	public void Animal()
	{
		System.out.println("Elephant");
	}

	@Test (priority=-1)
	public void vegitable()
	{
		System.out.println("onion");
	}

}
