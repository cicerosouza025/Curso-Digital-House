package conta;


public abstract class Conta {
	
	public Cliente cliente;
	private Double saldo;
	
	public Conta() {
		
	}
	public Conta(Double saldo) {
		this.saldo = saldo;
	}
	public Double getSaldo() {
		return saldo;
	}
	//as contas do banco permitem fazer depósitos, sacar dinheiro e consultar o saldo
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
}
