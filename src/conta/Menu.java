package conta;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
	  	Conta c1 = new Conta(123456, 123, 1, "Maria dos Santos", 2500.0f);
    	c1.visualiza(0);
    
    	Conta c2 = new Conta(123457, 123, 1, "João da Silva", 2000.0f);
    	c2.visualiza(0);
    	
    	Conta c3 = new Conta(123458, 123, 1, "Maria Joaquina", 100000.0f );
    	c3.visualiza(0);

		if (c1.sacar(100))
			System.out.println("Saque autorizado. O Saldo do cliente é de: "  + c1.getSaldo());
		else
			System.out.println("Saldo insuficiente. O Saldo do cliente é de: " + c1.getSaldo());
		
		c1.depositar(1000);
		System.out.println("Deposito realizado. O Saldo do cliente é de: " + c1.getSaldo());
	}

}
