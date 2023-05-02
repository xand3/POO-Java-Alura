package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	public static void  main(String[] args) {
		double salario = 2570.10;
		
		int valor = (int) salario;
		System.out.println(valor);
		
		/*
		long numeroGrande = 12312312312312L;
		short valorPequeno = 2131;
		byte b = 127;
		float pontoFlutuante = 3.14f;
		*/
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
