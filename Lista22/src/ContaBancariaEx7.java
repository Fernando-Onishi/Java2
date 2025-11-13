<<<<<<< HEAD

public class ContaBancariaEx7 {
	String titular = "Fernando";
	double saldo = 2500;
	
	void depositar(double valor) {
		System.out.println("Valor foi despositado com Sucesso!");
	}
	
	void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo Insuficiente!");
		}else if(valor <= saldo) {
			System.out.println("Saque realizado com sucesso!");
		}
	}
	void mostrarSaldo() {
		System.out.println("Titular: "+titular+"\nSaldo: "+saldo);
	}
}
=======

public class ContaBancariaEx7 {
	String titular = "Fernando";
	double saldo = 2500;
	
	void depositar(double valor) {
		System.out.println("Valor foi despositado com Sucesso!");
	}
	
	void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo Insuficiente!");
		}else if(valor <= saldo) {
			System.out.println("Saque realizado com sucesso!");
		}
	}
	void mostrarSaldo() {
		System.out.println("Titular: "+titular+"\nSaldo: "+saldo);
	}
}
>>>>>>> beec1c5a7f0f8521b341166fca7e2e0625fc685a
