package week2;

public class Bai1 {
    
    // Kiểm tra xem ba điểm có tạo thành tam giác không
    public static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        
        return (a + b > c && b + c > a && c + a > b);
    }
    
    // Tính khoảng cách giữa hai điểm
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // Kiểm tra xem tam giác có phải là tam giác vuông hay không
    public static boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
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
    public static boolean isIsoscelesTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        
        return (a == b || b == c || c == a);
    }
    
    // Kiểm tra xem tam giác có phải là tam giác đều hay không
    public static boolean isEquilateralTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        
        return (a == b && b == c);
    }
