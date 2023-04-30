
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida segura = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(segura);
		
		System.out.println(calc.getTotalImposto());
	}
	
	
}
