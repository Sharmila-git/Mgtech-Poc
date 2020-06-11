package junitdemo;
	import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
	import java.util.ArrayList;		

public class Main {				

	    private ArrayList<String> list;					

	    @BeforeClass		
	    public static void m1() {							
	        System.out.println("Using @BeforeClass , executed before all test cases ");					
	    }		

	    @BeforeMethod
		public void m2() {					
	        list = new ArrayList<String>();					
	        System.out.println("Using @Before annotations ,executed before each test cases ");					
	    }		

	    @AfterClass		
	    public static void m3() {							
	        System.out.println("Using @AfterClass ,executed after all test cases");					
	    }		

	    @AfterMethod
		public void m4() {					
	        list.clear();			
	        System.out.println("Using @After ,executed after each test cases");					
	    }		

	    @Test		
	    public void m5() {					
	        list.add("test");					
	        assertFalse(list.isEmpty());			
	        assertEquals(1, list.size());			
	    }		

	    @Test(enabled = false)
		public void m6() {					
	        System.out.println("Using @Ignore , this execution is ignored");					
	    }		

	    @Test(timeOut = 10)			
	    public void m7() {					
	        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");					
	    }		

//	    @Test(expected = NoSuchMethodException.class)					
//	    public void m8() {					
//	        System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");					

	    }		

			

