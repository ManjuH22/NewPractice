package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day2
{
	@Test(groups= {"smoke"})
	public void day2FirstMethod()
	{
		System.out.println("day2 i am first method");
		Assert.assertTrue(false);
	}

	@Test
	public void day2SecondMethod()
	{
		System.out.println("day2 i am Second method");
		System.out.println("git test phase 1");
		System.out.println("git test phase 2");
	}

	@Test
	public void day2ThirdMethod()
	{
		System.out.println("day2 i am Third method");
		System.out.println("git test phase retesting 1");
		System.out.println("git test phase retesting 2");
		System.out.println("git test phase retesting 4");
		System.out.println("develop branch testing from american guy");
		System.out.println("develop branch testing from indian guy");
		
		
	}

}
