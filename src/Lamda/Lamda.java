package Lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamda {

	public static void main(String[] args) {

//      A.Tổng quát:

//     - Cách viết ngắn gọn, đơn giản: (parameters) -> { body }
//     - Chỉ làm việc với Functional Inteface (inteface có 1 method duy nhất)

//      VD:

		Predicate<Integer> isEven = (n) -> n > 2; // ktra xem n có lớn hơn 2 ko
		System.out.println(isEven.test(4)); // true
		System.out.println(isEven.test(1)); // false

//      B.Một số Funtional Interface phổ biến:

		// 1.Runnable: Dùng để chạy 1 đoạn code trong thread.
		Runnable task = () -> System.out.println("Task đang chạy");
		new Thread(task).start();

		// 2.Supplier<T>: Ko nhận đầu vào, return 1 giá trị
		Supplier<Double> hd = () -> Math.random();
		System.out.println(hd.get());

		// 3.Consumer<T>: Nhận đtg đầu vào, thực hiện hđ trên đó nhưng ko return KQ
		Consumer<String> printer = (s) -> System.out.println("Hello " + s);
		printer.accept("word");

		// 4.Function<T, R>: Nhận 1 đtg loại T, trả về KQ loại R
		Function<String, Integer> change = (s) -> s.length();
		System.out.println(change.apply("Bach"));

		// 5.Predicate<T>: ktra 1 điều kiện
		Predicate<Integer> check = (s) -> s > 2;
		System.out.println(check.test(4));

		// 6.Comparator<T>: So sánh 2 đtg để sắp xếp compare(o1, o2)
		List<Integer> ds = Arrays.asList(2, 4, 1);

		ds.sort((a, b) -> a.compareTo(b)); // List ds được sắp xếp theo so sánh từng cặp gtri a, b
		System.out.println(ds);
		// hoặc:
		ds.sort((Comparator.comparing(s -> s)));

//       C.Ứng dụng của Lambda:

		// 1.Dùng trong Thread (như trên)
		// 2.Dùng trong Collections (Comparator) (như trên)
		// 3.Dùng trong Stream API:

		List<Integer> number = Arrays.asList(7, 3, 8, 4, 1);

		number.stream().filter(n -> n % 2 == 0).forEach(x -> System.out.println(x));

//      Trong Strem API có 2 loại hàm:

//      - Intermediate Operations (thao tác trung gian): xử lý dữ liệu nhưng ko tạo ra KQ cuối cùng mà trả về stream mới để nối tiếp
//      - Teminal Operations (thao tác kết thúc): xử lý đưa ra kết quả cuối cùng

		// Trong VD trên filter() thuộc loại Intermediate, forEach() thuộc loại còn lại
		// =))))
	}

}
