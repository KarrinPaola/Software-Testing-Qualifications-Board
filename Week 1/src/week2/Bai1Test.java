package week2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Bai1Test {

	@Test
	public void testNormalTriangle() {
		Bai1 bai1 = new Bai1(); 
		String result = bai1.typeTriangle(0, 0, 4, 0, 3, 3);
		System.out.println("1"+ result);
		assertEquals("Tam giác thường", result);
	}
	
	@Test
	public void testRightTriangle() {
		Bai1 bai1 = new Bai1(); 
		String result = bai1.typeTriangle(0, 0, 3, 0, 0, 4);
		System.out.println("2"+ result);
		assertEquals("Tam giác vuông", result);
	}
	
	@Test
	public void testEquilateralTriangle() {
		Bai1 bai1 = new Bai1(); 
		String result = bai1.typeTriangle(0, 0, 4, 0, 2, Math.sqrt(12));
		System.out.println("3"+ result);
		assertEquals("Tam giác đều", result);
	}
	
	@Test
	public void testIsoscelesTriangle() {
		Bai1 bai1 = new Bai1(); 
		String result = bai1.typeTriangle(0, 0, 1, 1, -1, 1);
		System.out.println("4"+ result);
		assertEquals("Tam giác cân", result);
	}
	
	@Test
	public void testNopeTriangle() {
		Bai1 bai1 = new Bai1(); 
		String result = bai1.typeTriangle(20, 8, 3, 3, 3, 3);
		System.out.println("5"+ result);
		assertEquals("Không phải tam giác", result);
	}
}
