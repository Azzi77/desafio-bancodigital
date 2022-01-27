package desafiodiobanco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new contacorrente();
		Conta poupança = new contapoupança();
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();
		

	}

}
