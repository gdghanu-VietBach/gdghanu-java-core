package OOP;

public class Dog extends Dongvat { // T/c 3: Inheritance
	String type;

	public Dog(String name, int soChan, int age, String tenChu, String type) {
		super(name, soChan, age, tenChu); // super giúp gọi lên lớp cha gần nhất
		this.type = type; // this là goị tại lớp con này
	}

	public String Tiengkeu(String a) { // phải ghi đè abstract method
		return a;
	}
}
