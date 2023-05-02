package byteBankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario xande = new Funcionario();
		xande.setNome("Alexandre Bastos");
		xande.setCpf("1231231");
		xande.setSalario(3500.00);
		
		System.out.println(xande.getNome());
		System.out.println(xande.getBonificacao());
		
	}

}
