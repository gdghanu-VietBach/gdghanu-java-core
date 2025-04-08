package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

	// Lưu trữ ptu dưới dạng Key - Value
	// Không cho phép khóa trùng lặp

	public static void main(String[] args) {

		Map<String, Integer> DsHs1 = new HashMap<>(); // ko duy trì thứ tự chèn
		DsHs1.put("Nam", 10);
		DsHs1.put("Sơn", 7);
		DsHs1.put("Bắc", 8);
		System.out.println(DsHs1);

		Map<String, Integer> DsHs2 = new LinkedHashMap<>(); // duy trì thứ tự chèn

		Map<String, Integer> DsHs3 = new TreeMap<>(); // sắp xếp khóa theo thứ tự tự nhiên
	}

}
