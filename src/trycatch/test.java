package trycatch;

public class test {
	public static void check(boolean a) throws myCustomException {
		if (!a) {
			throw new myCustomException("Điều kiện ko hợp lệ");
		}
	}

	public static void main(String[] args) {
		try {
			check(false);
		} catch (myCustomException e) {
			System.out.println("điều kiện sai");
		}
	}
}
