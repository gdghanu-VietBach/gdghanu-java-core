package XulyTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class xulyTime {
	public static void main(String[] args) {

		// 1. Lấy thời gian hiện tại:
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(date);
		System.out.println(time);

		// 2. Tạo thời gian cụ thể:

		LocalDate birthday = LocalDate.of(3000, 2, 31);
		LocalTime lunch = LocalTime.of(12, 30);

	}
}
