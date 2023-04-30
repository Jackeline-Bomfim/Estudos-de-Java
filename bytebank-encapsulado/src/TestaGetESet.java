
public class TestaGetESet {

	public static void main(String[] args) {
		Conta contaNova = new Conta(1337, 25748);
		contaNova.setNumero(1337);
		System.out.println(contaNova.getNumero());
		
		Cliente Paulo = new Cliente();
		
		Paulo.setNome("Paulo Silveira");
		contaNova.setTitular(Paulo);
		System.out.println(contaNova.getTitular().getNome());
		
		
		contaNova.getTitular().setProfissao("Programador");
		
		System.out.println(contaNova.getTitular().getProfissao());
		
	}
}
