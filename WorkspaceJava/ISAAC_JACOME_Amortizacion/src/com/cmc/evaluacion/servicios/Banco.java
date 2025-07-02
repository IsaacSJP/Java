package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	public Banco() {
		prestamos=new ArrayList<Prestamo>();
		clientes=new ArrayList<Cliente>();
	}
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncontrado=null;
		for(int i=0;i<clientes.size();i++) {
			if(cedula.equals(clientes.get(i).getCedula())) {
				clienteEncontrado=clientes.get(i);
			}
		}
		return clienteEncontrado;
	}
	
	public void registrarCliente(Cliente cliente) {
		Cliente busqueda=buscarCliente(cliente.getCedula());
		if (busqueda==null) {
			clientes.add(cliente);
		}else {
			System.out.println("el cliente ya esta registrado");
		}
	}
	
	public void asignarPrestamo(String cedula,Prestamo prestamo) {
		Cliente cliente=buscarCliente(cedula);
		if (cliente!=null) {
			CalculadoraAmortizacion.generarTabla(prestamo);
			cliente.getPrestamos().add(prestamo);
		}else {
			System.out.println("no es cliente del banco");
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		ArrayList<Prestamo> prestamos=buscarCliente(cedula).getPrestamos();
		return prestamos;
	}
}
