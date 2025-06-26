package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulce {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public MaquinaDulce() {
		Celda celda1=new Celda("");
		Celda celda2=new Celda("");
		Celda celda3=new Celda("");
		Celda celda4=new Celda("");
		this.celda1=celda1;
		this.celda2=celda2;
		this.celda3=celda3;
		this.celda4=celda4;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1.setCodigo(codigo1);
		this.celda2.setCodigo(codigo2);
		this.celda3.setCodigo(codigo3);
		this.celda4.setCodigo(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("celda1: "+this.celda1.getCodigo());
		System.out.println("celda2: "+this.celda2.getCodigo());
		System.out.println("celda3: "+this.celda3.getCodigo());
		System.out.println("celda4: "+this.celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (this.celda1.getCodigo() == codigo) {
			return celda1;
		} else if (this.celda2.getCodigo() == codigo) {
			return celda2;
		} else if (this.celda3.getCodigo() == codigo) {
			return celda3;
		} else if (this.celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Producto producto1 = celda1.getProducto();
		Producto producto2 = celda2.getProducto();
		Producto producto3 = celda3.getProducto();
		Producto producto4 = celda4.getProducto();
		System.out.println("****************CELDA " + this.celda1.getCodigo());
		System.out.println("stock: " + this.celda1.getStock());
		if(producto1==null) {
			System.out.println("no tiene producto");
		}else {
		System.out.println("producto: "+ producto1.getNombre() + " \nPrecio: " + producto1.getPrecio()+"\ncodigo: "+producto1.getCodigo());
		}
		System.out.println("****************CELDA " + this.celda2.getCodigo());
		System.out.println("stock: " + this.celda2.getStock());
		if(producto2==null) {
			System.out.println("no tiene producto");
		}else {
		System.out.println("producto: "+ producto2.getNombre() + " \nPrecio: " + producto2.getPrecio()+"\ncodigo: "+producto2.getCodigo());
		}
		System.out.println("****************CELDA " + this.celda3.getCodigo());
		System.out.println("stock: " + this.celda3.getStock());
		if(producto3==null) {
			System.out.println("no tiene producto");
		}else {
		System.out.println("producto: "+ producto3.getNombre() + " \nPrecio: " + producto3.getPrecio()+"\ncodigo: "+producto3.getCodigo());
		}
		System.out.println("****************CELDA " + this.celda4.getCodigo());
		System.out.println("stock: " + this.celda4.getStock());
		if(producto4==null) {
			System.out.println("no tiene producto");
		}else {
		System.out.println("producto: "+ producto4.getNombre() + " \nPrecio: " + producto4.getPrecio()+"\ncodigo: "+producto4.getCodigo());
		}
		System.out.println("saldo: "+this.saldo);
	}

	public Producto buscarProductoEnCelda(String codigoC) {
		if (this.celda1.getCodigo() == codigoC) {
			return celda1.getProducto();
		} else if (this.celda2.getCodigo() == codigoC) {
			return celda2.getProducto();
		} else if (this.celda3.getCodigo() == codigoC) {
			return celda3.getProducto();
		} else if (this.celda4.getCodigo() == codigoC) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		Producto producto = buscarProductoEnCelda(codigoCelda);
		return producto.getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoP) {
		Producto producto1 = celda1.getProducto();
		Producto producto2 = celda2.getProducto();
		Producto producto3 = celda3.getProducto();
		Producto producto4 = celda4.getProducto();

		if (producto1!=null && producto1.getCodigo() == codigoP) {
			return celda1;
		} else if (producto2!=null && producto2.getCodigo() == codigoP) {
			return celda2;
		} else if (producto3!=null && producto3.getCodigo() == codigoP) {
			return celda3;
		} else if (producto4!=null && producto4.getCodigo() == codigoP) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigo, int aumento) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stockA = celdaEncontrada.getStock();
		int stockF = stockA + aumento;
		celdaEncontrada.setStock(stockF);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		double precio=celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.saldo+=precio;
		mostrarProductos();
	}
	
	public double venderConCambio(String codigo,double valorI) {
		Celda celda=buscarCelda(codigo);
		double precio=celda.getProducto().getPrecio();
		double cambio=valorI-precio;
		vender(codigo);
		return cambio;
	}
	

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
