
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Abrindo conexao");
		//para dar erro já na construção do objeto
		//throw new IllegalStateException();
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");	
		throw new IllegalStateException();
	}	

	@Override
	public void close() {
		System.out.println("Fechando conexao");
		
	}

}
