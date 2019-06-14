package com.biz.controller;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp_01;
import com.biz.grade.service.ScoreServiceImp_03;

public class ScoreExec_01 {

	public static void main(String[] args) {
		
		int arrLen = 30;
		/*
		 *  인터페이스가 마련되어있는 클래스는
		 *  선언할 때는 인터페이스로 선언을 한다
		 * 
		 */
		// ScoreService sService = new ScoreServiceImp_01();
		ScoreService sService = new ScoreServiceImp_03(); // 10개 고정된 배열
	//	sService = new ScoreServiceImp_03(arrLen); // 30개 지정한 배열
		
		
		for(int i = 0; i < arrLen; i++	) {
			if(sService.inputScore(i)) break;
		}
		
		sService.total();
		sService.rank();
		sService.viewList();
		
		int intDeptAvg = sService.deptAvg();
		System.out.println("전체평균:" + intDeptAvg);
		
		sService.deptAvgView();
		
	}

}
