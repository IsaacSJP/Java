package com.clearminsd.maquina;

import java.util.ArrayList;

import com.clearminsd.componentes.Celda;
import com.clearminsd.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		Celda elementoCeldas;
		if (celdas.size() != 0) {
			for (int i = 0; i < celdas.size(); i++) {
				elementoCeldas = celdas.get(i);
				System.out.println("codigo " + i + ": " + elementoCeldas.getCodigo());
			}
		} else {
			System.out.println("no hay celdas");
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda elementoCeldas = null;
		Celda celdaEncontrada = null;
		if (celdas.size() != 0) {
			for (int i = 0; i < celdas.size(); i++) {
				elementoCeldas = celdas.get(i);
				if (codigo.equals(elementoCeldas.getCodigo())) {
					celdaEncontrada = elementoCeldas;
				} else {
				}
			}
		} else {
			System.out.println("no hay celdas");
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int strok) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, strok);
		} else {
			System.out.println("no encontramos la celda");
		}
	}

	public void mostrarProductos() {
		Celda elementoCelda = null;
		Producto elementoProducto = null;
		if (celdas.size() != 0) {
			for (int i = 0; i < celdas.size(); i++) {
				System.out.println("*******************************************");
				elementoCelda = celdas.get(i);
				elementoProducto = elementoCelda.getProducto();
				System.out.println("Celda: " + elementoCelda.getCodigo());
				if (elementoProducto != null) {
					System.out.println("Stock: " + elementoCelda.getStock());
					System.out.println("Nombre P: " + elementoProducto.getNombre());
					System.out.println("Precio: " + elementoProducto.getPrecio());
					System.out.println("Codigo P: " + elementoProducto.getCodigo());
				} else {
					System.out.println("no tiene producto!!!");
				}
				System.out.println("saldo: " + getSaldo());
			}
		} else {
			System.out.println("la maquina no esta configurada");
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda elementoCelda = null;
		Producto elementoProducto = null;
		if (celdas.size() != 0) {
			for (int i = 0; i < celdas.size(); i++) {
				elementoCelda = celdas.get(i);
				if (codigoCelda.contentEquals(elementoCelda.getCodigo())) {
					elementoProducto = elementoCelda.getProducto();
				} else {
				}
			}
		} else {
			System.out.println("la maquina no esta configurada");
		}
		return elementoProducto;
	}

	public double consultarPrecio(String codigoCelda) {
		Producto producto = buscarProductoEnCelda(codigoCelda);
		return producto.getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoP) {
		Celda elementoCelda = null;
		Producto elementoProducto = null;
		Celda celdaEncontrada = null;
		if (celdas.size() != 0) {
			for (int i = 0; i < celdas.size(); i++) {
				elementoCelda = celdas.get(i);
				elementoProducto = elementoCelda.getProducto();
				if (elementoProducto != null && codigoP.contentEquals(elementoProducto.getCodigo())) {
					celdaEncontrada = elementoCelda;
				}
			}
		} else {
			System.out.println("no hay celdas");
		}
		return celdaEncontrada;
	}

	public void incrementarProducto(String codigoP, int aumento) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoP);
		int stockA = celdaEncontrada.getStock() + aumento;
		celdaEncontrada.setStock(stockA);
	}

	public void vender(String codigoC) {
		Celda celdaEncontrada = buscarCelda(codigoC);
		Producto producto = buscarProductoEnCelda(codigoC);
		int stockA = celdaEncontrada.getStock() - 1;
		double valorA = getSaldo() + producto.getPrecio();
		celdaEncontrada.setStock(stockA);
		setSaldo(valorA);
		mostrarProductos();
	}

	public double venderConCambio(String codigo, double valorI) {
		Celda celda = buscarCelda(codigo);
		double precio = celda.getProducto().getPrecio();
		double cambio = valorI - precio;
		vender(codigo);
		return cambio;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productos=new ArrayList<Producto>();
		Celda elementoCelda;
		Producto elementoProducto;
		for (int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			elementoProducto=elementoCelda.getProducto();
			if(elementoProducto.getPrecio()<=limite) {
				productos.add(elementoProducto);
			}else {}
		}
		return productos;
	}
}
