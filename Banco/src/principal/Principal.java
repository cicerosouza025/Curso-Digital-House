package principal;

import conta.Cliente;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		
		
		
		ContaPoupanca a = new ContaPoupanca(new Cliente(65456,"Silva",499180283,4455665), 100.0);
		a.sacar(30);
		a.depositar(100);
        System.out.println("Saldo apos saque : " + a.getSaldo() + " R$");
       
       
		
	}
}