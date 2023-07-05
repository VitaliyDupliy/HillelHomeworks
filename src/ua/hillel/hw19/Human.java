package ua.hillel.hw19;

public class Human {
	
	
	
	
	
	@BeforeSuite
	public void methodBefore() {
		System.out.println("Method with @BeforeSuite annotation");
	}
	
	
	@AfterSuite
	public void methodAfter() {
		System.out.println("Method with @AfterSuite annotation");
	}
	
	@Test(priority = 1)
	public void methodTEst1() {
		System.out.println("methodTest wiht priority " + 1);
	}
	
	@Test(priority = 10)
	public void methodTEst2() {
		System.out.println("methodTest wiht priority " + 10);
	}
	
	@Test(priority = 3)
	public void methodTEst3() {
		System.out.println("methodTest wiht priority " + 3);
	}
	
	@Test(priority = 6)
	public void methodTEst4() {
		System.out.println("methodTest wiht priority " + 6);
	}
	
	@BeforeSuite
	public void methodTEst5() {
		System.out.println("methodTest wiht priority " + 0);
	}
	

	
	

}
