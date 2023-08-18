package abstracao;

public class Mensalista extends Colaborador{
	
	

	@Override
	double calcularSalario() {
		
		return this.getSalarioBruto() * 0.10;
		
	}
	

}
