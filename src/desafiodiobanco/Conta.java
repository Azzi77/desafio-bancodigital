package desafiodiobanco;

public abstract class Conta implements Iconta {	
	
	private static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int nummero;
	protected double saldo;
	

	public conta() {
		this.agencia = AGENCIA_PADRAO;
		this.nummero = SEQUENCIAL++;
	
	}		

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo +=valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar((valor);
		contaDestino.depositar(valor);
				
	}


	public int getAgencia() {
		return agencia;
	}




	public int getNummero() {
		return nummero;
	}




	public double getSaldo() {
		return saldo;
	}
		
	

