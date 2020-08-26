package conta;

public class ContaPoupanca extends Conta {
	
	private Double taxaJuros;
	
	
	public ContaPoupanca(Cliente cliente, Double saldo) {
		super(saldo);
		this.cliente = cliente;
		
	}
		
	public ContaPoupanca(Double saldo, Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public void sacar(double  valor) {
		
		double limite = getSaldo() - valor;
		
		if(limite >= 0) {
			super.sacar(valor);
		}
		else{
			System.out.println("Valor superou seu saldo disponivel");
		}
	}
	
	public void recolherJuros() {
		double valor = getSaldo() * this.taxaJuros;
		super.depositar(valor);
	}

	@Override
	public String toString() {
		return "ContaPoupanca [taxaJuros=" + taxaJuros + "]";
	}
	
}
