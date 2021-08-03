package GuruSchools.GuruSchools_Maven;

import org.testng.annotations.Test;

public class TestNGTCs {

	public TestNGTCs() {
		// TODO Auto-generated constructor stub
	}
	
	@Test 
	public void addition()
	{
		System.out.println("Sum of two numbers");
	}
	
	@Test (priority=0)
	public void subtraction()
	{
		System.out.println("subtraction of two numbers");
		
	}

	@Test
	public void multiplication()
	{
		System.out.println("multiplication of two numbers");
		
	}
	
	@Test
	public void division()
	{
		System.out.println("division of two numbers");
		
	}
}
