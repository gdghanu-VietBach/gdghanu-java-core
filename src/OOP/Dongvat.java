package OOP;

public abstract class Dongvat { // Abstract class
	String name;
	int SoChan; // số chân của con đó =)))

	// T/c 1: Encapsulation:
	private int age; // chỉ có thể được s/d trong class; gần tạo get, set để s/d ngoài // class)
	protected String tenChu; // tên chủ của đv (chỉ có thể s/d trong kế thừa cha/con)

	public Dongvat(String name, int soChan, int age, String tenChu) {
		this.name = name;
		this.SoChan = soChan;
		this.age = age;
		this.tenChu = tenChu;
	}

	public abstract String Tiengkeu(String a); // T/c 2: Abstraction

	public String Dichuyen(String b) {
		return b;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
