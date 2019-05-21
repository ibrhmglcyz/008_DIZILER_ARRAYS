package com.vektorel;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
				
		
				// Kullanıcıdan 5 sayı alan ve bunları toplayan program.
				
				int[] sayilar = new int[5];
				
				Scanner sc;
				int sayi;
				sc = new Scanner(System.in);
				
				for(int i=0;i<sayilar.length;i++) {		
				System.out.println((i+1)+". Sayıyı Giriniz...: ");
				sayi = sc.nextInt();
				sayilar[i] = sayi;
				}
				int toplam=0;
						
				for(int i=0;i<sayilar.length;i++) {
					toplam += sayilar[i];
				}
				System.out.println("Toplam Değer...: "+ toplam);

	}

}
