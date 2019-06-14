package com.biz.controller;

import java.awt.BufferCapabilities.FlipContents;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_01 {

	public static void main(String[] args) {
		
		String scoreFile = "src/com/biz/data/Score_01.txt";
		
		FileWriter fileWriter;
		PrintWriter printer;
		
		try {
			
			fileWriter = new FileWriter(scoreFile);
			printer = new PrintWriter(fileWriter);
			
			for(int i = 0; i < 100; i++) {
				printer.println(i);
			}
			/*
			 *  파일 쓰기(기록) 기능은
			 *  내용을 기록하는 코드가 수행되더라도
			 *  실제 파일에 내용을 저장하지 않는다.
			 *  
			 *  그래서
			 *  파일 내용을 강제로 저장하도록 메소드를 실행해 주워야 한다.
			 */
			printer.flush(); //필수
			printer.close(); //필수
			fileWriter.close(); //선택
			System.out.println("파일 기록 완료!");
		} catch (IOException e) {
			
			System.out.println("원인 불명의 기록 불가!!");
		}
		
	}

}
