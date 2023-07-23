package edu.kh.array2.practice;

public class Array2Practice {

	public void practice1() { 

		String[][] array = new String[3][3];
		
		//저장하기
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {
				
				String A = String.format("(%d, %d)", row, col );  // format 형태로 저장하기

				array[row][col] = A;
			}
		}
		
		// 출력하기
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				System.out.printf(array[row][col]+"  ");

			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] array = new int[4][4];

		// 저장
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				array[row][col] = row * 4 + col + 1;

			}
		}

		// 출력
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {

				System.out.print("  "+array[row][col]);

			}

			System.out.println();

		}

	}
	
	public void practice3() {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
