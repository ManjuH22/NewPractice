package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1
{

	@Test(groups= {"smoke"})
	public void day1firstTest()
	{
		System.out.println("day1 Hi i am first method");
	}

	@Parameters({"URL1"})
	@Test
	public void day1secondTest(String URL)
	{
		System.out.println("day1 Hi i am second method " + URL);
	}
	@Parameters({"URL"})
	@Test
	public void thirdTest(String urlname)
	{
		System.out.println("day1 Hi i am third method " + urlname);
	}

	@Test(dataProvider="getvalue")
	public void fourthTest(String Username, String Password)
	{
		System.out.println("day 1 Hi i am fourth method");
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
	       Object[][]  data= new Object[2][2];
	       data[0][0]= "manjunath@gmail.com";
	       data[0][1]= "manju@pass123";
	       
	       data[1][0]= "manoj@gmail.com";
	       data[1][1]= "manoj@pass123";
	       return data;
	             
	}
	
	@DataProvider
	public Object[][] getvalue()
	{
		return new Object[][] {{"manjunatha@gmail.com", "manju@pass123"}, {"manoj@gmail.com", "manoj@pass123"}};
	}

	
	
	
}