package com.vektorel;

import java.util.Scanner;

public class Runner3 {

	public static void main(String[] args) {
				
				// Öğrenci Listesi Oluşturacağız. Liste uzunluğunu
				// öğretmen belirleyecek.
				Scanner sc;
				sc = new Scanner(System.in);
				System.out.println("Sınıf Listesi Kaç Kişilik...:");
				int ogrenciSayisi = sc.nextInt();
				
				String[] ogrenciListesi = new String[ogrenciSayisi];
				
				for(int i=0;i<ogrenciSayisi;i++) {
				System.out.println(i+1+". Öğrencinin adını giriniz..:");
				sc = new Scanner(System.in);
				String ogrenci = sc.nextLine();
				ogrenciListesi[i]= ogrenci;
				}
				
				System.out.println("*** SINIF LİSTESİ ***");
				for (int i = 0; i < ogrenciListesi.length; i++) {
					System.out.println(i+1+". Öğrenci...: "+ ogrenciListesi[i]);
					
				}

	}

}
