package week2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDate;

public class Bai2Test {

    @Test
    public void testNextDay() {
        // Ngày hiện tại là 2024-04-22
        LocalDate currentDate = LocalDate.of(2024, 4, 22);
        
        // Ngày kế tiếp sẽ là 2024-04-23
        LocalDate expectedNextDay = LocalDate.of(2024, 4, 23);
        
        // Tính toán ngày kế tiếp
        LocalDate nextDay = Bai2.nextDay(currentDate);
        
        // So sánh ngày kế tiếp với ngày mong đợi
        assertEquals(expectedNextDay, nextDay);
    }
}
