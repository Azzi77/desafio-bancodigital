package desafiodiobanco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new contacorrente();
		Conta poupan�a = new contapoupan�a();
		
		cc.imprimirExtrato();
		poupan�a.imprimirExtrato();
		

	}

}
