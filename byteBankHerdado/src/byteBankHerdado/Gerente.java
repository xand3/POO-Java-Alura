package byteBankHerdado;

public class Gerente extends Funcionario {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}	
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); // super - o codigo fica mais expressivo, ou seja o salario foi definido na classe mãe/super
	}
}
