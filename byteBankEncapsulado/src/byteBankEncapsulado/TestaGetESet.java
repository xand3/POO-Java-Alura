package byteBankEncapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 122;
	
		System.out.println(conta.getNumero());
		
		Cliente xande = new Cliente();
		xande.setNome("Alexandre Bastos");
		
		conta.setTitular(xande);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(xande);
		System.out.println(conta.getTitular());
		
	}
	
}
