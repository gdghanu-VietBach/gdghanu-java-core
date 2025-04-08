package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListClass {

	// List được dùng khi cần duy trì thứ tự và có thể có phần tử trùng

	public static void main(String[] args) {

		List<String> ds1 = new ArrayList<>(Arrays.asList("a", "b")); // Tốc độ truy cập nhanh
		System.out.println(ds1.get(0));

		List<String> ds2 = new LinkedList<>(); // Có các hàm tối ưu cho thao tác chèn/xóa ở đầu/cuối
		ds2.addFirst("abc");

		List<String> ds3 = new Vector<>(); // Giống ArrayList nhưng có synchronizec

		// Duyệt phần tử:

		// 1. Dùng For-each:

		for (String a : ds1) {
			System.out.print(a);
		}

		// 2. Cách này e ko bt gọi tên là j nma e học đc trong lúc làm btap trên trg
		// ::)))

		ds1.forEach(System.out::println);
	}
}
