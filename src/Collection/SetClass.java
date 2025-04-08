package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	// Set ko cho phép phần tự trùng lặp

	public static void main(String[] args) {

		Set<Integer> ds1 = new HashSet<>(Arrays.asList(12, 31, 45, 27)); // Ko duy trì thứ tự phần tử nhập v
		System.out.println(ds1);

		Set<Integer> ds2 = new LinkedHashSet<>(Arrays.asList(12, 31, 45, 27)); // Giữ nguyên thứ tự thêm
		System.out.println(ds2);

		Set<Integer> ds3 = new TreeSet<>(Arrays.asList(12, 31, 45, 27)); // Sắp xếp ptu theo thứ tự tự nhiên
		System.out.println(ds3);
	}

}
