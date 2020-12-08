package com.coder.pad;

public class DotProduct 
{
	public static void main(String[] arg) {
		int[][] m1= {
						{1,4,6,10},
						{2,7,5,3}
					};
		int[][] m2= {
						{1,4,6},
						{2,7,5},
						{9,0,11},
						{3,1,0}
					};
		
		productOfMatrics(m1, m2);
	}

	public static void productOfMatrics(int[][] m1, int[][] m2) {
		int row = m1.length;
		int col = m2[0].length;
		
		if(m1[0].length!=m2.length) 
		{
			System.out.println("product is not possible");
			return ;
		}
		
		int[][] result = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				//int[] m11 = m1[i];
				int temp = 0;
				
				for (int k = 0; k < m1[i].length; k++) {
					temp += m1[i][k] * m2[k][j];
				}
				result[i][j] = temp;
			}
		}
		display(result);
	}
	public static void display(int[][] arr) {
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0 ; j<arr[0].length;j++)
			{
				System.out.print(" | "+ arr[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
