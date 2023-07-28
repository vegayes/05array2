package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

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
		
		Scanner sc = new Scanner(System.in);
		
		practice7();
		
		System.out.println("=".repeat(40));
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		

//		System.out.println(students);
	
	
	
	
	
	
	}
	
	

}
