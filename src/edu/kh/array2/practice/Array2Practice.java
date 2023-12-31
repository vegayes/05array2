package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		String[][] array = new String[3][3];

		// 저장하기
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				String A = String.format("(%d, %d)", row, col); // format 형태로 저장하기

				array[row][col] = A;
			}
		}

		// 출력하기
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				System.out.printf(array[row][col] + "  ");

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

				System.out.print("  " + array[row][col]);

			}

			System.out.println();

		}

	}

	public void practice3() {

		int[][] array = new int[4][4];

		int num = 16;

		// 저장
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				array[row][col] = num;

				num--;

			}

		}

		// 출력
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {

				System.out.print(array[row][col] + "\t");

			}

			System.out.println();

		}

	}

	public void practice4() {

		// 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후

		int[][] array = new int[4][4];

		int rowSum = 0;
		int colSum = 0;
		int total = 0;

		// 값 저장 및 행 덧셈
		for (int row = 0; row < array.length - 1; row++) {

			colSum = 0;

			for (int col = 0; col < array[row].length - 1; col++) {

				array[row][col] = (int) (Math.random() * 10 + 1);

				colSum += array[row][col];
			}
			total += colSum;
			array[row][3] = colSum;
		}

		// 열 덧셈
		for (int col = 0; col < array[0].length - 1; col++) {

			rowSum = 0;
			for (int row = 0; row < array.length - 1; row++) {

				rowSum += array[row][col];
			}

			total += rowSum;
			array[3][col] = rowSum;
		}

		array[3][3] = total;

		// 출력하기
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {

				System.out.printf(array[row][col] + " \t ");

			}
			System.out.println();
		}

	}

	public void practice5() {// 안했음..
		
		char temp = 'A';

		while (true) {
			System.out.print("행 크기 :");
			int col = sc.nextInt();
			if(col < 1 || col > 10) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			System.out.print("열 크기 :");
			int row = sc.nextInt();
			if(row < 1 || row > 10) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			// 배열에 저장
			char[][] arr = new char[col][row];
			for ( int i = 0 ; i < arr.length; i++) {
				
				for ( int j =0 ; j < arr[i].length; j++) {
					
					arr[i][j]=temp;
					temp++;	
				}

			}
			
			int x = 0;
			int y = 0; 
			char tmp = 0;
			
			// 값 섞기
			for ( int i = 0; i < arr.length; i++ ) {
				for( int j = 0; j < arr[i].length; j++) {
					
					x = (int) (Math.random() * i);
					y = (int) (Math.random() * j); 
					
					tmp = arr[i][j];
					arr[i][j] = arr[x][y];
					arr[x][y] = tmp;
				}
			}
			
			// 출력
			for ( int i = 0 ; i < arr.length; i++) {
				
				for ( int j =0 ; j < arr[i].length; j++) {
					
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			break;

		}

	}

	public void practice6() {

		// 가변 배열 사용!

		System.out.print("행의 크기 : ");
		int col = sc.nextInt();

		char[][] arr = new char[col][];

		for (int i = 0; i < col; i++) {

			System.out.printf("%d열의 크기 : ", i);
			int row = sc.nextInt();

			arr[i] = new char[row];
		}

		char ch = 'a';
		// 값 할당
		for (int a = 0; a < arr.length; a++) {

			for (int b = 0; b < arr[a].length; b++) {

				arr[a][b] = ch;

				ch++;
			}
		}

		// 출력
		for (int a = 0; a < arr.length; a++) {

			for (int b = 0; b < arr[a].length; b++) {

				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}

	}

}
