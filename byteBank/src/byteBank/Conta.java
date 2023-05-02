package byteBank;

public class Conta { // quando uma classe é instanciada os valores dos atributos são zerados
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	String cpf;
	String profissao;
	
	
	public void deposita(double valor) {
		this.saldo += valor; // this referencia ao objeto instanciado
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
			return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			return false;
	}
}