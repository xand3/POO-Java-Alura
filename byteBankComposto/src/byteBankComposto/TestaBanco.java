package byteBankComposto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente xande = new Cliente();
		xande.nome = "Alexandre bastos";
		xande.cpf = "111.111.111-11";
		xande.profissao = "programador";

		Conta contaDoXande = new Conta();
		contaDoXande.deposita(100);
		// associa o cliente xande a conta contaDoXande
		contaDoXande.titular = xande;
		System.out.println(contaDoXande.titular.nome);
	}
}
