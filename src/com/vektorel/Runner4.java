package com.vektorel;

import java.util.Scanner;

public class Runner4 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Öğrenci Sayısı..:");
		int sayi = sc.nextInt();
		
		String[] ogrList = new String[sayi];
		
		for(int i=0; i<sayi;i++) {
		System.out.println("Öğrencinin Adını gir..:");
		sc = new Scanner(System.in);
		String ad = sc.nextLine();
		ogrList[i] = ad;
		}
		
		System.out.println("*** ÖĞRENCİ LİSTESİ ***");
		for(int i=0;i<sayi;i++) {
			
			System.out.println(i+1+". "+ ogrList[i]);
		}
		

	}

}
