package Thread;

public class MyThread extends Thread { // kế thừa lớp Thread để chạy luồng 1 cách đơn giản

	String message;

	public MyThread(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println("Luồng đang chạy: " + Thread.currentThread().getName() + " - " + message);
	}

	public void run2() {
		System.out.println("Skidibi");
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Xin chào");
		MyThread t2 = new MyThread("Hello");

		t1.start(); // khi gọi hàm start, chỉ hàm run được chạy
		t2.start();

		// mỗi luồng t1, t2 là 1 đtg riêng biệt, khi cần tạo 1 luồng mới phải tạo 1 đtg
		// riêng mới
	}
}
