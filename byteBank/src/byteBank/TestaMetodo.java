package byteBank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoXande = new Conta();
		contaDoXande.saldo = 100;
		contaDoXande.deposita(50);
		System.out.println(contaDoXande.saldo);
		
		contaDoXande.saca(20);
		System.out.println(contaDoXande.saldo);
		
		Conta contaDaLuma = new Conta();
		
		contaDaLuma.deposita(1000);
		
		if(contaDaLuma.transfere(300, contaDoXande)) {
			System.out.println("transferencia feita com sucesso");
		} else {
			System.out.println("não há dinheiro suficiente");
		}
		
		System.out.println(contaDaLuma.saldo);
		System.out.println(contaDoXande.saldo);
		
		contaDoXande.titular = "Alexandre Bastos";
		System.out.println(contaDoXande.titular);
	}
}
