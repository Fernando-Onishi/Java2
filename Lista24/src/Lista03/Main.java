package Lista03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		Vendedor v = new Vendedor();
		
		g.setNome("Fernando");
		g.setSalarioBase(1500);
		g.setDepartamento("TI");
		
		v.setNome("Jonas");
		v.setSalarioBase(1000);
		
		g.exibirInfo();
		g.gerenciar();
		
		v.exibirInfo();
		v.vender();
		
	}
}