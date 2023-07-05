package ua.hillel.hw19;

public class Human {
	
			
	
	@BeforeSuite
	public void methodBefore() {
		System.out.println("Method with @BeforeSuite annotation");
	}
	
	
	public void methodBefore2() {
		System.out.println("Method2 with @BeforeSuite annotation");
	}
	
	
	@AfterSuite
	public void methodAfter() {
		System.out.println("Method with @AfterSuite annotation");
	}
	
	@Test(priority = 1)
	public void methodTest1() {
		System.out.println("methodTest with priority " + 1);
	}
	
	@Test(priority = 10)
	public void methodTest2() {
		System.out.println("methodTest with priority " + 10);
	}
	
	@Test(priority = 3)
	public void methodTest3() {
		System.out.println("methodTest with priority " + 3);
	}
	
	@Test(priority = 6)
	public void methodTest4() {
		System.out.println("methodTest with priority " + 6);
	}
	
	
	

	
	

}
