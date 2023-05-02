package byteBankComposto;

public class Conta { // quando uma classe é instanciada os valores dos atributos são zerados
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor; // this referencia ao objeto instanciado
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}







