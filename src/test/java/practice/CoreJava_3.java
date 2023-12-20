package practice;

public class CoreJava_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is an object that represents the sequence of characters
		// String literal
		String s3 = "Shivanand Ram Dhavan";

		// Using new memory allocate operator
		String s1 = new String("Welcome");
		String s2 = new String("Welcome");

		String s = "Shivanand Ramrao Dhavan Patil";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[3]);
		
		System.out.println("***********************1***********************");
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(splittedString[i]);
		}

		System.out.println("***********************2***********************");
		
		for(int i=s.length(); i<0; i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
