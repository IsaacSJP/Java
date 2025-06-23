package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public Item(String nombre,int pActuales) {
		this.nombre=nombre;
		this.productosActuales=pActuales;
	}
	
	public void imprimir() {
		System.out.println("nombre: "+this.nombre);
		System.out.println("productos Actuales: "+this.productosActuales);
		System.out.println("productos Devueltos: "+this.productosDevueltos);
		System.out.println("productos Vendidos: "+this.productosVendidos);
	}
	public void vender(int cantidad) {
	this.productosActuales=this.productosActuales-cantidad;
	this.productosVendidos=this.productosVendidos+cantidad;
	}
	public void devolver(int cantidad) {
		this.productosActuales=this.productosActuales+cantidad;
		this.productosVendidos=this.productosVendidos-cantidad;
		this.productosDevueltos=this.productosDevueltos+cantidad;
		}
}
