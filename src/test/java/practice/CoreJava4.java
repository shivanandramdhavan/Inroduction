package practice;

public class CoreJava4 {

	public static void main(String[] args) {
		// Methods demo class 1
		//Inside of main block do not create a method because if we create method in main block then get an error.

		CoreJava4 d = new CoreJava4();
		// d.getData();
		String name = d.getData1();
		System.out.println(name);

		// How to access another class methods? Simply by creating object we access the
		// other class methods
		CoreJava5 d1 = new CoreJava5();
		d1.villageName();

		// How to access methods without creating objects? Simply write a "Static" while
		// writing a method
		getData2();

	}

	public void getData() {
		System.out.println("Shivanand Ram Dhavan Patil");
	}

	public static String getData2() {
		System.out.println("Farmers");
		return "Traditional faremrs";
	}

	// ***************************************************************
	public String getData1() {
		System.out.println("Dhavan Family");
		return "Ramrao Sambhaji Dhavan Patil";
	}

}
