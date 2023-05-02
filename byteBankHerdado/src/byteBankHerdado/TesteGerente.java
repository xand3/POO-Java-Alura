package byteBankHerdado;

public class TesteGerente {
	public static void main(String[] args) {
		Gerente alexandre = new Gerente();
		alexandre.setNome("Alexandre Bastos da Silva");
		alexandre.setCpf("2231231");
		alexandre.setSalario(8000);
		alexandre.setSenha(123);
		
		System.out.println(alexandre.getNome());
		System.out.println(alexandre.getBonificacao());
		System.out.println(alexandre.autentica(123));
		
	}
}
