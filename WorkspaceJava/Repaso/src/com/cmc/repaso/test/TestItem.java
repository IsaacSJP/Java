package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1=new Item("lapiz",20);
		Item item2=new Item("manzana",30);

		item1.imprimir();
		item1.vender(10);
		item1.devolver(5);
		item1.imprimir();

		item2.imprimir();
		item2.vender(15);
		item2.devolver(7);
		item2.imprimir();

	}

}
