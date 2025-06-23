package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//creo el objeto cuenta1
		Cuenta cuenta1=new Cuenta("03476");
		//coloco un valor en la cuenta1
		cuenta1.setSaldo(675);
		//creo el objeto cuenta2
		Cuenta cuenta2=new Cuenta("03476","C",98);
		//creo el pbjeto cuenta3
		Cuenta cuenta3=new Cuenta("03476");
		//modijico el tipode cuenta
		cuenta3.setTipo("C");
		//imprimir cuenta1,cuenta2,cuenta3
		System.out.println("<---------Valores Iniciales--------->");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("<---------Valores Modificados--------->");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		//creo el objeto cuenta4
		Cuenta cuenta4=new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		//creo el objeto cuenta5
		Cuenta cuenta5=new Cuenta("0557","C",10);
		
		//creo el objeto cuenta6
		Cuenta cuenta6=new Cuenta("0666");
		
		System.out.println("<---------Cuenta 4,5,6--------->");
		cuenta4.imprimirConMiestilo();
		cuenta5.imprimirConMiestilo();
		cuenta6.imprimirConMiestilo();
		
	}

}
