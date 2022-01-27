package desafiodiobanco;

public class contacorrente extends Conta {
	
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Corrente");
		System.out.println(String.format("agencia:%d", super.agencia));
		System.out.println(String.format("Numero:%d", super.numero));
		System.out.println(String.format("Saldo:%2.f", super.saldo));
				
	}
	
	
}
	