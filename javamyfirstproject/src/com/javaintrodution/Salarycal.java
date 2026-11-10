package com.javaintrodution;

public class Salarycal {

	public static void main(String[] args) {
		Integer sal=5000;
		Double gst=(double)(sal*0.03);
		System.out.println(gst);
		
		Double pf=(double)(sal*0.02);
		System.out.println(pf);
		
		Double allowences=(double)(sal*0.02);
		System.out.println(allowences);
		
		Double month=gst+pf+allowences*30;
		System.out.println(month);
		
		Double annul=month*12;
		System.out.println(annul);
		
		Double year=pf+gst+12;
		System.out.println(year);

	}

}
