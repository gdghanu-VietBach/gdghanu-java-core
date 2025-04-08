package Thread;

public class MyRunnable implements Runnable { // sử dụng Runnable khi muốn đa kế thừa

	String message;

	public MyRunnable(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("Thread đang chạy: " + Thread.currentThread().getName() + message);
	}

	public static void main(String[] args) {
		MyRunnable task = new MyRunnable("Xin chào");

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();

		// task chỉ là 1 đối tượng duy nhất nhưng có thể chạy trên nhiều luồng
	}

}
