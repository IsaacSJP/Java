package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.setMarca("Toyota");
		auto1.setAnio(2000);
		auto1.setPrecio(18500.00);
		auto2.setMarca("Kia");
		auto2.setAnio(2011);
		auto2.setPrecio(15000.00);
		
		System.out.println("auto1.getMarca() "+auto1.getMarca());
		System.out.println("auto1.getAnio() "+auto1.getAnio());
		System.out.println("auto.getPrecio() "+auto1.getPrecio());
		System.out.println("*********************************");
		System.out.println("auto2.getMarca() "+auto2.getMarca());
		System.out.println("auto2.getAnio() "+auto2.getAnio());
		System.out.println("auto2.getPrecio() "+auto2.getPrecio());
	}

}
