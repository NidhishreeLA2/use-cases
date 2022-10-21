package com.example.simple;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "name";
		String n1 = "name";
		String n2 = new String("name");
		System.out.println(n==n1);
		System.out.println(n==n2);
		System.out.println(n.equals(n1));
		System.out.println(n.equals(n2));

	}

}
