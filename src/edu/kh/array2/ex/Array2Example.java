package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {

	/*
	 * 2차원 배열
	 * 
	 * => 자료형이 같은 1차원 배열을 묶음으로 다루는 것 => 행, 열 개념 추가 =>
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void ex1() {

		// 2차원 배열 선언 :: stack영역에만 생성
		int[][] arr;
		// int 2차원 배열을 참조하는 참조변수 선언
		// 참조형 == 참조 변수 == 레퍼런스 변수 == 레퍼런스

		// 2차원 배열 할당
		// -> new 자료형[행크기][열크기]

		arr = new int[2][3];
		// heap 영역에 int 2차원 배열 2행 3열 공간을 할당

		// 2차원 배열 초기화
		// 1) 행렬 인덱스 하여 직접 초기화
		/*
		 * arr[0][0] = 10; arr[0][1] = 20; arr[0][2] = 30;
		 * 
		 * arr[1][0] = 40; arr[1][1] = 50; arr[1][2] = 60;
		 */

		// 2) 이중 for문을 이용한 초기화

		int num = 10; // 배열 요소 초기화에 사용할 변수

		// * 배열 길이
		// -> 배열명.length는 변수가 직접참조 하고있는 배열의 길이를 반환

		System.out.println(arr.length); // 2 (행 길이)
		// arr이 참조하고 있는 2차원 배열의 행의 길이

		System.out.println(arr[0].length); // 3 (열 길이)
		// arr[0] 행이 참조하고 있는 1차원 배열의 (열) 길이

		System.out.println(arr[1].length); // 3 (열 길이)
		// arr[1] 행이 참조하고 있는 1차원 배열의 (열) 길이

		for (int row = 0; row < arr.length; row++) { // 행 반복 (0,1)

			for (int col = 0; col < arr[row].length; col++) { // 열 반복 ( 0, 1, 2)

				arr[row][col] = num; // row는 0으로 고정
				num += 10;

			}
		}

		// Arrays.toString(배열명) : 참조하고 있는 1차원 배열 값을 문자열로 반환
		System.out.println("toString() :" + Arrays.toString(arr));

		// Arrays.deepToString(배열명)
		// => 참조하고 있는 배열의 데이터가 나오는 부분까지 파고 들어가서
		// 모든값을 문자열로 반환
		System.out.println("deepString() :" + Arrays.deepToString(arr));

	}

	public void ex2() {

		// 2차원 배열 선언과 동시에 초기화
		// 3행 3열짜리 정수형 2차원 배열 선언과 동시에
		// 1 ~ 9 까지 초기화
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 행 별로 합 출력

		for (int row = 0; row < arr.length; row++) { // 행 반복

			int sum = 0;

			for (int col = 0; col < arr[row].length; col++) { // 열 반복

				sum += arr[row][col];
				// 0 0 --> 1
				// 0 1 --> 2
				// 0 2 --> 3
				// -----------------------------------------------
				// 1 0 --> 4
				// 1 1 --> 5
				// 1 2 --> 6
				// -----------------------------------------------
				// 2 0 --> 7
				// 2 1 --> 8
				// 2 2 --> 9
			}

			System.out.printf("%d행의 합 : %d\n", row, sum);

		}

		// 열 별로 합 출력 및 전체 출력
		int total = 0;

		System.out.println("-".repeat(50));

		for (int a = 0; a < arr[0].length; a++) { // 열 반복

			int sum = 0;

			for (int b = 0; b < arr.length; b++) { //행 반복
				sum += arr[a][b];
				
				// 0 0 --> 1
				// 1 0 --> 4
				// 2 0 --> 7
				// -----------------------------------------------
				// 0 1 --> 2
				// 1 1 --> 5
				// 2 1 --> 8
				// -----------------------------------------------
				// 0 2 --> 3
				// 1 2 --> 6
				// 2 2 --> 9
				
			}
			System.out.printf("%d열의 합 : %d\n", a, sum);
			
			total += sum;
		}

		/* 전체 합 출력 다른 방법
		int sum = 0; 
		
		for(int row =0; row< arr.length; row++){
		 	for( int col =0; col < arr[row].length; col++){
		 		
		 			sum+= arr[row][col];
		 	}
		 ]
		*/
		
		System.out.println("전체 합 :" + total);

	}
	
	
	public void ex3() {
		// 가변 배열 
		// -> 2차원 배열 생성 시 마지막 배열 차수(열)를 지정하지 않고
		//  나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		
		char [][] arr = new char[4][];
						// char 2차원 배열 생성 시 행 부분만 생성 
		
		arr[0] = new char[3] ;  // 0행 인덱스에 3열 1차원 배열 생성하여 주소값 저장
		arr[1] = new char[4] ;  // 1행 인덱스에 4열 1차원 배열 생성하여 주소값 저장 
		arr[2] = new char[5] ;  // 2행 인덱스에 5열 1차원 배열 생성하여 주소값 저장 
		arr[3] = new char[2] ;  // 3행 인덱스에 2열 1차원 배열 생성하여 주소값 저장 
		
		char ch ='a';
		
		for ( int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) { // 제일 긴 인덱스 값을 기준 잡으면 오류남. (해당행의 길이랑 맞지 않을 수 있기 때문)
				
				arr[row][col] = ch++;
				
			}

		}
		System.out.println(Arrays.deepToString(arr));
	
	}
	
	
	
	public void ex4() { // 빙고 만들기! 
		// 5X 5 ( 1~25 ) random으로 넣기 
		// 1 ~25의 숫자를 입력하세요 ( 종료 : 0) 
		// 숫자 입력하면 0으로 변하게 하기! 
		
		// 배열에 넣기 ! ===>
		// 1) 2차원 배열을 이용해서 25까지 랜덤한 값을 => 5로 나누어서 대입하기
		// 2) 
		
		int[][] bingo;
		bingo = new int[5][5];
		
		
		int random = (int) (Math.random()*25 +1);
		
		for ( int col = 0; col <bingo.length; col++) {
			
			for ( int row = 0; row < bingo[col].length; row++) {
				
				
			}
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
