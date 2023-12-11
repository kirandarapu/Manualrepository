package TestNGfRAMEWORK;

import org.testng.annotations.Test;

public class Examples {
	
	int a=10,b=20;
	@Test
	public void sum() {
		
		System.out.println(a+b);
	}
	
	@Test
	public void sub() {
		
		System.out.println(b-a);
	}
	@Test
	public void mult() {
		
		System.out.println(b*a);
	}
	
	@Test
    public void div() {
    	
    	System.out.println(b/a);
    }
}
