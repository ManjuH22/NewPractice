package test1;

import org.testng.annotations.Test;

public class PS1 extends PS

{
	@Test
	public void testRun()
	{
		letsdoThis(); 
		int a;
		PS2 ps2=new PS2(3);
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multifly());
		
		
	}
	

}
