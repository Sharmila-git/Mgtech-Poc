package junitdemo;
	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import org.junit.Rule;		
	import org.junit.rules.ErrorCollector;		

	public class Errorcollector {				
	    @Rule		
	    public ErrorCollector collector = new ErrorCollector();							

	    @Test		
	    public void example() {					
	    collector.addError(new Throwable("There 1"));							
	    collector.addError(new Throwable("There 2"));							
	    System.out.println("Hello");					
        try {			
            AssertJUnit.assertTrue("A " == "B");					
        } 
        catch (Throwable t) {					
            collector.addError(t);					
        }		
        System.out.println("World!!!!");	
	    }		
	}	

