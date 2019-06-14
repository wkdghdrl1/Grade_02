package com.biz.grade.service;

import java.util.Random;
import java.util.Scanner;

import com.biz.grade.model.ScoreVO;

public class ScoreServiceImp_02 implements ScoreService {

	ScoreVO[] scArray;
	Random rnd;
	Scanner scan;
	
	/*
	 * 생성자가 매개변수를 달리해서
	 * 중복되어 만들어지고 있다.
	 * 이렇게 되면
	 * 생성자에서 실행할 코드들이
	 * 같은코드가 반복되는 불편한 상황이 된다.
	 * 
	 * 매개변수가 없는 생성자에서
	 * 매개변수(배열의 개수)가 있는 생성자를 호출할 수 있는
	 * 방법이 있으면 좋겠다.
	 */

	public ScoreServiceImp_02() {

//		scArray = new ScoreVO[10];
//		rnd = new Random();
//		scan = new Scanner(System.in);
		// 나 자신에게 10이란 값을 전달하는 생성자를 호출하라
		// 매개변수가 있는 생성자를 호출하는 코드
		this(10);
	}
	
	public ScoreServiceImp_02(int arrLen) {

		scArray = new ScoreVO[arrLen];
		rnd = new Random();
		scan = new Scanner(System.in);
		for(int i = 0; i < scArray.length; i++) {
			scArray[i] = new ScoreVO();
		}
	}
	
	/* 키보드에서 성적을 입력받아서 scArray추가
	 * --End 문자열 입력 받으면 종료 
	 * 
	 */
	@Override
	public boolean inputScore(int number) throws NumberFormatException {
			
		// for(int i = 0;  i < scArray.length; i++) {
			
			 
			
			 System.out.print((number+1) + "번 학생 국어성적 입력(종료 : end ");
			 String strKor = scan.nextLine();
			
			 if(strKor.equals("end"))  return true;
			 
			 int intKor = Integer.valueOf(strKor);
			 System.out.print((number+1) + "번 영어성적 입력 : ");
			 String strEng = scan.nextLine();
			 int intEng = Integer.valueOf(strEng);

			 System.out.print((number+1) + "번 국어성적 입력 : ");
			 String strMath = scan.nextLine();
			 int intMath = Integer.valueOf(strMath);
			
			 ScoreVO vo = new ScoreVO();
			 vo.setNumber(number+1);
			 vo.setKor(intKor);
			 vo.setEng(intEng);
			 vo.setMath(intMath);
			 
			 scArray[number] = vo;
	//	 }
		
		return false;
	}

	@Override
	public void total() {
		for (ScoreVO vo : scArray) {

			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);

		}

	}

	@Override
	public void rank() {
			// 총점을 기준으로 내림차순 정렬을 수행
			// rank 값을 대입해준다.
		for(int i = 0; i < scArray.length; i++) {
			for(int j = i + 1; j < scArray.length; j++) {
				if(scArray[i].getTotal() < scArray[j].getTotal()) {
					ScoreVO _score = scArray[i];
					scArray[i] = scArray[j];
					scArray[j] = _score;
				}
					
				
			}
		}
		
		int rank = 0;
		for(ScoreVO vo : scArray) {
			vo.setRank(++rank);
		}
		
	}

	@Override
	public void viewList() {

		System.out.println("빅데이터반 성적표");
		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차\t");
		for (ScoreVO vo : scArray) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAverage() + "\t");

			System.out.println(vo.getRank());
		}
		System.out.println("====================================================");

	}

	@Override
	public int deptAvg() {
		// 전체학생의 반 평균을 계산
		int avgTotal = 0;
		for (ScoreVO vo : scArray) {
			avgTotal += vo.getAverage();
		}
		avgTotal /= scArray.length;
		return avgTotal;

	}

	@Override
	public void deptAvgView() {
		// TODO Auto-generated method stub

	}

}
