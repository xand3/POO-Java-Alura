package byteBank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // instanciando classe conta
		primeiraConta.saldo = 200; // definindo valor para saldo
		System.out.println(primeiraConta.saldo);
		primeiraConta.agencia = 146;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("primeira conta tem: " + primeiraConta.saldo); // buscando valor do saldo
		System.out.println("segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia); // quando uma classe é instanciada os valores dos atributos são zerados
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta pertence a agencia:  "+ segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são iguais");
		} else {
			System.out.println("não são as mesmas contas");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
