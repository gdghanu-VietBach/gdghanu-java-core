package Enum;

public class EnumClass {

	// Enum dùng để biểu diễn các tập hợp hằng số

	// 1. Enum ko có constructor

	enum Language {
		java, python, go
	}

	// 2. Enum có constructor

	enum BXH {
		ronaldo(10), messi(9), hoangduc(15), congphung(100);

		private int goal;

		private BXH(int goal) { // constructor của enum phải là private
			this.goal = goal;
		}

		public int getGoal() {
			return goal;
		}
	}

	public static void main(String[] args) {
		Language s = Language.java; // ko sử dụng new =)))

		BXH b = BXH.congphung;

		System.out.println(s);
		System.out.println(b.getGoal());

		Language a = Language.valueOf("python"); // Hàm valueOf trả về gtri enum theo tên chuỗi

		System.out.println(a.ordinal()); // Hàm ordinal trả về index của hằng số đó trong enum
	}
}
