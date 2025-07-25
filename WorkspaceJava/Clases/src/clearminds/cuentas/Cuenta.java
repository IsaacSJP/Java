package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	public Cuenta(String id,String tipo,double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	public Cuenta(String id) {
		this.id=id;
		this.tipo="A";
	}
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimir() {
		System.out.println("*****************************");
		System.out.println("\n CUENTA \n");
		System.out.println("*****************************");
		System.out.println("Nùmero de cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("*****************************");
	}
	public void imprimirConMiestilo() {
		System.out.println("------------------------------");
		System.out.println("\t CUENTA \n");
		System.out.println("------------------------------");
		System.out.println("\tNùmero de cuenta: "+id);
		System.out.println("\tTipo: "+tipo);
		System.out.println("\tSaldo: USD "+saldo);
		System.out.println("------------------------------");
	}
}