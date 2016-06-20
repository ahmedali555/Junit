import static org.junit.Assert.*;

import org.junit.Test;

public class JunitLab_Test {

	@Test
	
	/*public void ConcetenateTest(){
		
		
		JunitLab test=new JunitLab();
		String result=test.Concetenate("one", "two");
		//assertEquals("EXPECTED RESULT",ACTUAL RESULT);
		assertEquals("onetwo",result);		
		
		
		
	}*/
	
	public void MultiplyTest(){
		
		JunitLab test1=new JunitLab();
		
		int number1 = 5;
		int number2 = 5;
		int result1=test1.multiply(number1, number2);
		
		assertEquals(25,result1);
		
		
		
		
		
	}
	
	
	
	
}

