import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EasyOperatorTest {

	@Test
	void testAdd() {
		EasyOperator easyOperator = new EasyOperator(); 
		int result = easyOperator.add(10, 20); 
		assertEquals(30, result, "2 + 3 should equal 5");
	}
	
	@Test
	void testNegativeNumber() {
		EasyOperator easyOperator = new EasyOperator(); 
		int resutl = easyOperator.add(-2, -3); 
		assertEquals(-5, resutl, "-2 + (-3) should equal -5");
	}
	
	@Test
    void testAddZero() {
		EasyOperator easyOperator = new EasyOperator(); 
        int result1 = easyOperator.add(5, 0);
        assertEquals(5, result1, "5 + 0 should equal 5");
        
        int result2 = easyOperator.add(0, 5);
        assertEquals(5, result2, "0 + 5 should equal 5");
    }
}
