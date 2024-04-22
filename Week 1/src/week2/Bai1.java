package week2;

import java.util.Arrays; 

public class Bai1 {
    
    // Kiểm tra xem ba điểm có tạo thành tam giác không
    public static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        
        return (a + b > c && b + c > a && c + a > b);
    }
    
    // Tính khoảng cách giữa hai điểm
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // Kiểm tra xem tam giác có phải là tam giác vuông hay không
    public static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        
        // Sắp xếp các cạnh theo thứ tự giảm dần
        double[] sides = {a, b, c};
        Arrays.sort(sides);
        
        // Áp dụng định lý Pythagoras để kiểm tra
        return (Math.pow(sides[2], 2) == Math.pow(sides[0], 2) + Math.pow(sides[1], 2));
    }
    
    // Kiểm tra xem tam giác có phải là tam giác cân hay không
    public static boolean isIsoscelesTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        
        return (a == b || b == c || c == a);
    }
    
    // Kiểm tra xem tam giác có phải là tam giác đều hay không
    public static boolean isEquilateralTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        
        double epsilon = 0.0001; // Ngưỡng sai số
        
        return Math.abs(a - b) < epsilon && Math.abs(b - c) < epsilon && Math.abs(c - a) < epsilon;
    }

    
    public static String typeTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Kiểm tra xem ba điểm tạo thành tam giác hay không
        if (!isTriangle(x1, y1, x2, y2, x3, y3)) {
            // Nếu không, trả về "Không phải tam giác"
            return "Không phải tam giác";
        } else if (isEquilateralTriangle(x1, y1, x2, y2, x3, y3)) {
            // Nếu là tam giác đều, trả về "Tam giác đều"
            return "Tam giác đều";
        } else if (isRightTriangle(x1, y1, x2, y2, x3, y3)) {
            // Nếu là tam giác vuông, trả về "Tam giác vuông"
            return "Tam giác vuông";
        } else if (isIsoscelesTriangle(x1, y1, x2, y2, x3, y3)) {
            // Nếu là tam giác cân, trả về "Tam giác cân"
            return "Tam giác cân";
        } else {
            // Nếu là tam giác thường, trả về "Tam giác thường"
            return "Tam giác thường";
        }
    }

}
