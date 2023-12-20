package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// check if array has multiple of 2

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
				// break;
			} else {
				System.out.println(numbers[i] + " is not multiple of 2");
			}
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Shivanand");
		a.add("Ramrao");
		a.add("Dhavan");
		a.add("Patil");

		System.out.println(a.get(0));
		// Create object of the class- object.method

		System.out.println("**********************First**************************");

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("**********************Second**************************");
		for (String val : a) {
			System.out.println(val);

			System.out.println("***********************Third*************************");

			// How to check, item is present in ArrayList?
			System.out.println(a.contains("Shivanand"));
			System.out.println(a.contains("Ram"));
		}

		System.out.println("*********************Fourth***************************");
		String[] name = { "Shivanand", "Ramrao", "Dhavan", "Patil" };
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Shivanand"));
	}

}
