package mysele;

import org.testng.annotations.Test;

public class GroupEx {
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("S1");
	}

	@Test(groups= {"regression"})
	public void test2()
	{
		System.out.println("R1");
	}
	@Test(groups= {"sanity","regression"})
	public void test3()
	{
		System.out.println("S1,R1");
	}
	
}
