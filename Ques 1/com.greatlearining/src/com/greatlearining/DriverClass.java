package com.greatlearining;

import java.util.Scanner;

public class DriverClass {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the total number floors in the building : ");
			int floor = sc.nextInt();
			int size[] = new int[floor + 1];
			for (int i = 1; i < floor + 1; i++) {
				System.out.println("Enter the floor size given on day : " + i);
				int m = sc.nextInt();
				size[m] = i;
			}
			int j = floor;
			boolean flag;
			System.out.println("The order of construction is as follows ");
			for (int i = 1; i <= floor; i++) {
				flag = false;
				System.out.println("Day " + i + " :");
				while (j >= 1 && size[j] <= i) {
					flag = true;
					System.out.print(j + " ");
					j--;
				}
				if (flag == true) {
					System.out.println();
				}
			}
		}
	}

}
