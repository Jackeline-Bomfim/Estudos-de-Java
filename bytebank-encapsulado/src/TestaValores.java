
public class TestaValores {

	public static void main(String[] args) {
		Conta novaConta = new Conta(1337, 24736);
		System.out.println(novaConta.getAgencia() + novaConta.getNumero());
		
		Conta novaConta2 = new Conta(1337, 24737);
		System.out.println(novaConta.getAgencia() + novaConta.getNumero());
		
		Conta novaConta3 = new Conta(1337, 24738);
		System.out.println(novaConta.getAgencia() + novaConta.getNumero());
	
	}
}
