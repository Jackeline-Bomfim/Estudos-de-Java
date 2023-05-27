package br.com.bytebank.banco.teste;

public class TesteArraysPrimitivos {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];// inicialização de um array
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
