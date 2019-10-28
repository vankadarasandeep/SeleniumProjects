package com.Alert;

public class StudentsDetails {
	public static String college="sree";
		public StudentsDetails(int i, String string, String college2) {
			/**
			 * @author sandeep
			 * 
			 */
			System.out.println(i+" "+string+" "+college2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsDetails s= new StudentsDetails(10,"sandeep",college);
		System.out.println(s);

	}

}
