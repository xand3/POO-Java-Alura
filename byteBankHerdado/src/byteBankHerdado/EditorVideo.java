package byteBankHerdado;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + 100; // super - o codigo fica mais expressivo, ou seja o salario foi definido na classe mãe/super
	}
}
