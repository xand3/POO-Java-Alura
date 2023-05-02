package byteBankHerdado;

public class Designer extends Funcionario {

	public double getBonificacao() {
		return 200; // super - o codigo fica mais expressivo, ou seja o salario foi definido na classe mãe/super
	}
}
