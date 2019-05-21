package com.vektorel;

public class Runner5 {

	public static void main(String[] args) {
		
		String[][] ogrList = new String[5][3];
		
		ogrList[2][0]= "3";
		ogrList[2][1]= "Muhammet";
		ogrList[2][2]= "HOCA";
		
		ogrList[3][0]= "4";
		ogrList[3][1]= "Muhammet2";
		ogrList[3][2]= "HOCA2";
		
		ogrList[4][0]= "5";
		ogrList[4][1]= "Muhammet3";
		ogrList[4][2]= "HOCA3";
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(ogrList[i][j]);
			}
		}
		
//		System.out.println(ogrList[2][0]
//							+" - "
//							+ogrList[2][1]
//							+" - "
//							+ogrList[2][2]);
//		


	}

}
