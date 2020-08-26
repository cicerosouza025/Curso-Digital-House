package conta;



public class ContaCorrente extends Conta {
	
private Double limiteChequeEspecial;
	
	public ContaCorrente(Cliente cliente, Double saldo) {
		super(saldo);
		this.cliente = cliente;
	
	}
	public ContaCorrente(Double saldo, Double limiteChequeEspecial) {
		super(saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;
		
		if((limite + limiteChequeEspecial) < 0) {
			System.out.println("Você superou seu limite de saque incluindo o Cheque Especial!");
		}else {
			super.sacar(valor);			
			if(limite < 0) {
				limiteChequeEspecial = limiteChequeEspecial + limite;
			}
		}
	}
	
	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValor());
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [limiteChequeEspecial=" + limiteChequeEspecial + ", getSaldo()=" + getSaldo() + "]";
	}

}
