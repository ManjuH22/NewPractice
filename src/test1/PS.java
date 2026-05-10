package test1;

import org.testng.annotations.BeforeMethod;

public class PS 

{
	public void letsdoThis()
	{
		System.out.println("He i am the parentclass");
	}

	@BeforeMethod
	public void iam()
	{
		System.out.println("I am before");
	}
}
