package Lesson3;

public class EasyLoop {
	public static void loopWithBranching(int a, int b) {
		if(a >= b) {
			System.out.println("Chạy kiểu quái gì");
		}
		else {
			for (int i = a; i <= b; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i + " là số chẵn");
	            } else {
	                System.out.println(i + " là số lẻ");
	            }
	        }
		}
    }
}
