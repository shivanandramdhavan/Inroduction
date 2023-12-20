package practice;

public class CoreJava_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Data Types in Java
		int employeeNumber = 257;
		double decimalAmount = 5.18;
		String myName = "Shivanand Ram Dhavan";
		char letter = 'Q';
		boolean myCard = true;

		System.out.println(employeeNumber);
		System.out.println(decimalAmount);
		System.out.println(myName);
		System.out.println(letter);
		System.out.println(myCard);

		// Arrays in Java
		int[] arr1 = new int[5];
		arr1[0] = 257;
		arr1[1] = 258;
		arr1[2] = 259;
		arr1[3] = 260;
		arr1[4] = 261;

		int[] arr2 = { 256, 255, 254, 253, 252 };

		System.out.println("Expected is 260 & actual is: " + arr1[3]);
		System.out.println("Expected is 253 & actual is: " + arr2[3]);

		// How to print values which have in array
		// for loop
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("EmployeeNumber is: PWK" + arr1[i]);
		}
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println("EmployeeNumber is: TRD" + arr2[i]);
		}

		String[] arr3 = {"Shivanand", "pruthiraj", "Abhay", "Kaushal", "Sagar"};
		
		for (int i=0; i<arr3.length; i++) {
			System.out.println("Employee Name is: " + arr3[i]);
		}
		
		String [] arr4 = new String[3];
		arr4[0] = "Sambhaji";
		arr4[1] = "Ganpatrao";
		arr4[2] = "Dhavan Patil";
		
		
		//enhanced for loop (Simplified syntax of for loop)
		for (String s: arr4) {
			System.out.println(s);
		}
		
	}

}
