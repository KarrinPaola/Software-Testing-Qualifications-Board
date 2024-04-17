package Lesson3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EasyLoopTest {
    
    @Test
    public void testLoopWithBranching() {
        // Arrange
        int a = 0;
        int b = 4;
        String expectedOutput = "0 là số chẵn\n1 là số lẻ\n2 là số chẵn\n3 là số lẻ\n4 là số chẵn\n";
        
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Act
        EasyLoop.loopWithBranching(a, b);
        
        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void testLoopWithBranching_SameValue() {
        // Arrange
        int a = 5;
        int b = 5;
        String expectedOutput = "Chạy kiểu quái gì\n";
        
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Act
        EasyLoop.loopWithBranching(a, b);
        
        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    public void testLoopWithBranching_AIsNegative() {
        // Arrange
        int a = -5;
        int b = 5;
        String expectedOutput = "-5 là số lẻ\n-4 là số chẵn\n-3 là số lẻ\n-2 là số chẵn\n-1 là số lẻ\n0 là số chẵn\n1 là số lẻ\n2 là số chẵn\n3 là số lẻ\n4 là số chẵn\n5 là số lẻ\n";
        
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Act
        EasyLoop.loopWithBranching(a, b);
        
        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    public void testLoopWithBranching_BIsNegative() {
        // Arrange
        int a = 5;
        int b = -5;
        String expectedOutput = "Chạy kiểu quái gì\n";
        
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Act
        EasyLoop.loopWithBranching(a, b);
        
        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    public void testLoopWithBranching_BothNegative() {
        // Arrange
        int a = -5;
        int b = -10;
        String expectedOutput = "Chạy kiểu quái gì\n";
        
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Act
        EasyLoop.loopWithBranching(a, b);
        
        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }
}
