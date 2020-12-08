package com.coder.pad;

public class EqualPowerToEachOther 
{
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 5, 4 };
		int[] y = { 2, 4, 6, 9, 3 };

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {

				if (pow(x[i], y[j]) == pow(y[j], x[i])) {
					System.out.println("(" + x[i] + "," + y[j] + ") and (" + y[j] + "," + x[i] + ")");
				}
			}
		}
	}
	public static int pow(int a, int b) {
		int temp = 1;
		for (int i = 0; i < b; i++) {
			temp = temp * a;
			// System.out.println(i+" "+a+" "+b);
		}
		// System.out.println(temp);
		return temp;

	}
}
