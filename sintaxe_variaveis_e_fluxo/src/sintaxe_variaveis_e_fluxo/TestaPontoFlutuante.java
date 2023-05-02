package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario = 2570.10;
		System.out.println("Meu salário vai ser " +  salario);
		
		double idade = 20;
		
		double divisao = 3.14 / 2;
		System.out.println(divisao + idade);
		
		int outraDivisao = 5 / 2; // se os operadores são int o resultado é int
		System.out.println(outraDivisao);
		
		double novaTentativa = 5.0 / 2; // se um dos números é float o resultado é float
		System.out.println(novaTentativa);
	}
}
