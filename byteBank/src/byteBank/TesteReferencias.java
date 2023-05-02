package byteBank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // a variavel primeiraConta é uma referencia para o objeto primeiraConta
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
				
		Conta segundaConta = primeiraConta; // a variavel segundaConta vira outra referencia para o objeto primeiraConta
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma coisa");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
