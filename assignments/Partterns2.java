package com.My_first_Project;

public class Partterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partterns2(5);
	}
		 static void Partterns2 (int n) {
		        for (int row = 1; row <= n; row++) {
		            // for every row, run the col
		            for (int col = 1; col <= row; col++) {
		                System.out.print("* ");
		            }
		            // when one row is printed, we need to add a newline
		            System.out.println();
		        }
		    }
		
	}


