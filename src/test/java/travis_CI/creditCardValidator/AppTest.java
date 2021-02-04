package travis_CI.creditCardValidator;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import travis_CI.creditCardValidator.*;
public class AppTest {
	
	App obj;
	String test1,test2,test3;
	@Before
	public void setUp() {
		obj=new App();
		test1="5196081888500645";
		test2="4388576018402626";
		test3="379354508162306";
	}
	
	
    @Test
    public void credValTest1() {
    	assertEquals(obj.isCredCardValid(test1),true);
    }
    
    @Test
    public void credValTest2() {
    	assertEquals(obj.isCredCardValid(test2),false);
    }
    
    @Test
    public void credValTest3() {
    	assertEquals(obj.isCredCardValid(test3),true);
    }
}