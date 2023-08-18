package abstracao;

public class FuncionarioMain {
	public static void main(String[] args) {
		
		Mensalista a1 = new Mensalista();
		a1.setNome("Jeferson");
		a1.setCargo("programador");
		a1.setSalarioBruto(1000.00);
		//System.out.println(a1.calcularSalarioLiquido());
		
		Horista h1 = new Horista();
		h1.setNome("Alexania");
		h1.setCargo("programador");
		h1.setSalarioBruto(1000.00);
		h1.setQtdadeHoras(5);
		h1.setValorHoraTrabalhada(200.00);
		
		System.out.println(h1.calcularSalarioLiquido());
		
		
	
		
		
	}
	
	

}
