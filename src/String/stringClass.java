package String;

public class stringClass {
	public static void main(String[] args) {

		// String:
		String a = "cậu vàng";

		// biến String là biến immutable, vì vậy khi cần thay đổi trực tiếp trên biến
		// (ko cần sinh ra biến mới) ta sẽ dùng StringBuilder và StringBuffer

		StringBuilder b = new StringBuilder("Helo"); // StringBuilder
		b.append("word");

		StringBuffer c = new StringBuffer("Helo"); // StringBuffer
		c.delete(1, 3);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// String Pool là nơi lưu trữ các biến String, các biến giống nhau sẽ được lưu
		// tại cùng 1 vị trí
	}
}
