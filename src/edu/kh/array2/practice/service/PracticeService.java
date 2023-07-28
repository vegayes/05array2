package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);

	public void practice7() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		
		int index = 0;
		
		// 1분단 저장
		for (int i = 0 ; i < group1.length; i++) {
			
			for ( int j = 0; j < group1[i].length ; j++ ) {
				
				group1[i][j] = students[index];
				
				index++;
 				
			}
			
		}
		
		// 2분단 저장
		for (int i = 0 ; i < group2.length; i++) {
			
			for ( int j = 0; j < group2[i].length ; j++ ) {
				
				group2[i][j] = students[index];
				
				index++;
 				
			}
			
		}
		
		System.out.println("== 1분단 ==");
		
		// 1분단 출력
		for (int i = 0 ; i < group1.length; i++) {
			
			for ( int j = 0; j < group1[i].length ; j++ ) {
				
				System.out.print(group1[i][j]+" ");
 				
			}
			System.out.println();
		}
		
		
		System.out.println("\n== 2분단 ==");
		
		// 2분단 출력
		for (int i = 0 ; i < group2.length; i++) {
			
			for ( int j = 0; j < group2[i].length ; j++ ) {
				
				System.out.print(group2[i][j]+" ");
 				
			}
			System.out.println();
		}
	
	}
	
	public void practice8() {
		
	/*	
		
		practice7();
		
		System.out.println("=".repeat(40));
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		

		System.out.println(students);
	*/
	
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		
		int index = 0;
		
		// 1분단 저장
		for (int i = 0 ; i < group1.length; i++) {
			
			for ( int j = 0; j < group1[i].length ; j++ ) {
				
				group1[i][j] = students[index];
				
				index++;
 				
			}
			
		}
		
		// 2분단 저장
		for (int i = 0 ; i < group2.length; i++) {
			
			for ( int j = 0; j < group2[i].length ; j++ ) {
				
				group2[i][j] = students[index];
				
				index++;
 				
			}
			
		}
		
		System.out.println("== 1분단 ==");
		
		// 1분단 출력
		for (int i = 0 ; i < group1.length; i++) {
			
			for ( int j = 0; j < group1[i].length ; j++ ) {
				
				System.out.print(group1[i][j]+" ");
 				
			}
			System.out.println();
		}
		
		
		System.out.println("\n== 2분단 ==");
		
		// 2분단 출력
		for (int i = 0 ; i < group2.length; i++) {
			
			for ( int j = 0; j < group2[i].length ; j++ ) {
				
				System.out.print(group2[i][j]+" ");
 				
			}
			System.out.println();
		}
	
	
		System.out.println("=".repeat(40));
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		int groupPoint = 0;
		int rowPoint = 0;
		String directionPoint = null;
		
		
		// 1분단에서 이름 찾기
		for (int i = 0 ; i < group1.length; i++) {

			for ( int j = 0; j < group1[i].length ; j++ ) {
				
				if ( group1[i][j].equals(name)) {
					
					groupPoint = 1;
					
					rowPoint = i+1;
					
					if( j == 0 ) {
						directionPoint = "왼쪽";
					}else {
						directionPoint = "오른쪽";
					}
					
					
				}
			}
		}
		
		// 2분단에서 이름 찾기
		for (int i = 0 ; i < group2.length; i++) {
			
			for ( int j = 0; j < group2[i].length ; j++ ) {
				
				if ( group2[i][j].equals(name)) {
					
					groupPoint = 2;
					
					rowPoint = i+1;
					
					if( j == 0 ) {
						directionPoint = "왼쪽";
					}else {
						directionPoint = "오른쪽";
					}
					
					
				}
			}
		}
		
		System.out.println("검색하신 "+ name + " 학생은 " + groupPoint + "분단 " + rowPoint + "번째 줄 " + directionPoint +"에 있습니다.");

	}
	
	public void practice9() {

		
		char [][] arr = new char[6][6];
		
		// 1) 첫 번째 행만 저장		
		char ch = '0';
			
		for ( int j = 1 ; j< arr[0].length; j++) {
			arr[0][j] = ch;
			ch++;
		}		

		// 2) 첫 번째 열만 저장
		ch = '0';	
		for ( int i = 1 ; i< arr.length; i++) {
			arr[i][0] = ch;
			ch++;
		}
		
	
		System.out.print("행 인덱스 입력 : ");
		int colIndex = sc.nextInt();

		System.out.print("열 인덱스 입력 : ");
		int rowIndex = sc.nextInt();
		
		// 3) X값 저장 
		char temp = 'X';
		
		for(int i = 0; i < arr.length; i++) {
			
			for( int j =0; j < arr.length; j++) {
				
				if(colIndex == i - 1 && rowIndex == j -1) {
					
					arr[i][j] = temp;

				}
				
			}
		}
		
		
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			
			for( int j =0; j < arr.length; j++) {
				
				System.out.print(arr[i][j]+" \t ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

	public void practice10() { // 굳이 이거 do-while 문 안써도되는거 같은딥,,?
		
		int colIndex = 99;
		
		char [][] arr = new char[6][6];
		
		
		do {
			
			// 1) 첫 번째 행만 저장		
			char ch = '0';
				
			for ( int j = 1 ; j< arr[0].length; j++) {
				arr[0][j] = ch;
				ch++;
			}		

			// 2) 첫 번째 열만 저장
			ch = '0';	
			for ( int i = 1 ; i< arr.length; i++) {
				arr[i][0] = ch;
				ch++;
			}
			
		
			System.out.print("행 인덱스 입력 : ");
			colIndex = sc.nextInt();
			if( colIndex == 99) {
				
				break;
			}
			

			System.out.print("열 인덱스 입력 : ");
			int rowIndex = sc.nextInt();
			
			// 3) X값 저장 
			char temp = 'X';
			
			for(int i = 0; i < arr.length; i++) {
				
				for( int j =0; j < arr.length; j++) {
					
					if(colIndex == i - 1 && rowIndex == j -1) {
						
						arr[i][j] = temp;

					}
					
				}
			}
			
			//출력
			for(int i = 0; i < arr.length; i++) {
				
				for( int j =0; j < arr.length; j++) {
					
					System.out.print(" "+arr[i][j]+"\t");
					
				}
				System.out.println();
			}
			System.out.println();
			
		} while(colIndex != 99);
		
		System.out.println("프로그램 종료");
		
		
	}
	
	
}
