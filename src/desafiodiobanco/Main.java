package desafiodiobanco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new contacorrente();
		Conta poupanša = new contapoupanša();
		
		cc.imprimirExtrato();
		poupanša.imprimirExtrato();
		

	}

}
