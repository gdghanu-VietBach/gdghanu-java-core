package ĐocFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ĐocFile {

//     A. Các bước đọc file:

	// 1. Tạo đường dẫn đến file
	// 2. Dùng các lớp hỗ trợ để đọc nội dung, in ra màn hình
	// 3. Đóng file

//     B. Các lớp dùng để đọc file:

	public static void main(String[] args) throws IOException {

		// 1. FileReader và BufferedReader để đọc theo dòng (văn bản text):
		BufferedReader path1 = new BufferedReader(new FileReader("file.txt")); // tạo đường dẫn đến file

		String MoiDong;

		while ((MoiDong = path1.readLine()) != null) { // đọc từng dòng cho đến khi dòng rỗng sẽ trả về null
			System.out.println(MoiDong);
		}

		path1.close();

		// 2. Dùng Files.readAllLines()

		Path path2 = Paths.get("file.txt"); // tạo đường dẫn

		List<String> lines = Files.readAllLines(path2); // đọc toàn bộ file và lưu trong lines

		for (String line : lines) {
			System.out.println(line); // in ra từng dòng
		}

		// 3. Dùng Files.readString

		String content = Files.readString(path2);
		System.out.println(content);

		// 4. FileInputStream để đọc file nhị phân"

		FileInputStream fis = new FileInputStream("rodi.png"); // tạo đường dẫn

		int data;

		while ((data = fis.read()) != -1) {
			System.out.println((char) data); // ép kiểu byte sang char để hiển thị đúng nội dung
		}

		fis.close();
	}
}
