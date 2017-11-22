package com.Assignment2;

import java.util.List;

public class Display {

	public void show(List<?> l, String title) {
		System.out.println("-------------------------------------------------------");
		System.out.printf("%s", title);
		for (Object s : l) {
			System.out.println(s);
		}
		System.out.println("-------------------------------------------------------\n");
	}

}
