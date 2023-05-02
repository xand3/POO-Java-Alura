package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("maior de idade");
			System.out.println("seja bem vindo");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("não é maior de idade mas pode entrar");
			} else {
			System.out.println("não é maior de idade");
			}
		}
	}
}
