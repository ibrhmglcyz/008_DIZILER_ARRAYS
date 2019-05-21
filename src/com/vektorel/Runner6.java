package com.vektorel;

import java.util.Scanner;

public class Runner6 {

	public static void main(String[] args) {

		String[][] ogrList = new String[3][4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
		System.out.println(i+1+".Öğrencinin Numarası..: ");
		String no = sc.nextLine();
		System.out.println(i+1+".Öğrencinin Adı..: ");
		String ad = sc.nextLine();
		System.out.println(i+1+".Öğrencinin Soyadı..: ");
		String soyad = sc.nextLine();
		System.out.println(i+1+".Öğrencinin Adresi..: ");
		String adres = sc.nextLine();
		System.out.println("------------------------");
		ogrList[i][0]= no;
		ogrList[i][1]= ad;
		ogrList[i][2]= soyad;
		ogrList[i][3]= adres;
		}
		
		System.out.println("*** ÖĞRENCİ LİSTESİ ***");
		for(int i=0;i<3;i++) {
			
			System.out.println(ogrList[i][0]
					+" - "
					+ogrList[i][1]
					+" - "
					+ogrList[i][2]
					+" - "
					+ogrList[i][3]										
										
					);
		}

	}

}
