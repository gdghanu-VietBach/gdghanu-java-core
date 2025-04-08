package Scannerr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testScanner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in); // đọc từ dữ liệu nhậ vào
		Scanner scan = new Scanner(new File("data.txt")); // đọc từ 1 file
		Scanner scanner = new Scanner("halo word"); // đọc từ 1 chuỗi

		// Cách s/d Scanner:
		int number = sc.nextInt(); // Nhập vào 1 số
		double number2 = sc.nextDouble();
		boolean check = sc.nextBoolean();

		// 1 lỗi thường gặp:

		int age = sc.nextInt(); // sau khi nhập vào 1 số, người dùng sẽ thường Enter để xuống dòng

		sc.nextLine(); // nếu ko có dòng này, Enter sẽ nhảy vào lệnh nextLine() ngay sau đó, gây ra 1
						// dòng rỗng

		String chuoi = sc.nextLine();

	}
}
