package byteBankEncapsulado;

public class Conta { // quando uma classe é instanciada os valores dos atributos são zerados
	private double saldo; // 0
	private int agencia; // 0
	private int numero; // 0
	private Cliente titular; // null
	private static int total; // static - cada objeto acessa um unico total, total pertence a classe Conta
	
	public Conta(int agencia, int numero) { // CONSTRUTORES | executado uma vez em cada instancia / rotina de inicialização
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta");
	}
	
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
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("O número da conta não pode ser negativo");
			return;
		} else {
			this.numero = numero;
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}







