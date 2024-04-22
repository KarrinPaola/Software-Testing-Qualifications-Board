package week2;

import java.time.LocalDate;

public class Bai2 {
    
    public static LocalDate nextDay(LocalDate currentDate) {
        return currentDate.plusDays(1);
    }

    public static void main(String[] args) {
        // Ngày hiện tại
        LocalDate currentDate = LocalDate.now();
        
        // Tính ngày kế tiếp
        LocalDate nextDay = nextDay(currentDate);
        
        // In ra ngày kế tiếp
        System.out.println("Ngày kế tiếp là: " + nextDay);
    }
}

