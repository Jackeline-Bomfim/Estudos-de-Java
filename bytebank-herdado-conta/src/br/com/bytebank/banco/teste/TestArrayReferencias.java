package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 33);		
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(24, 43);		
		contas[1] = cc2;
		
		ContaCorrente cc3 = new ContaCorrente(72, 44);		
		contas[2] = cc3;
		
		ContaPoupanca cc4 = new ContaPoupanca(42, 73);		
		contas[3] = cc4;
		
		ContaCorrente cc5 = new ContaCorrente(62, 35);		
		contas[4] = cc5;
		
		System.out.println(contas[2].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) contas[3]; //type cast
		System.out.println(ref.getNumero());
	}
}
