package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		int sayi = 5;
		int[] sayilar = {0,1,2,3,4,5,6,7,8,9};
		int[] rakamlar = new int[10];
		String[] gunler = new String[7];
		
		System.out.println(sayilar);
		System.out.println("ilk sayi..: "+ sayilar[6]);
		gunler[1] = "Sali";
		//gunler[0] = 5; //String degerli dizilere, integer deger atanmaz!

	}

}
