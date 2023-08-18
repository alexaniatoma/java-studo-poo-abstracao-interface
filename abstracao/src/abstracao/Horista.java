package abstracao;

public class Horista extends Colaborador{
	
	private double qtdadeHoras;
	private double valorHoraTrabalhada;

	@Override
	double calcularSalario() {
		
		return this.qtdadeHoras * this.valorHoraTrabalhada;
	}

	public double getQtdadeHoras() {
		return qtdadeHoras;
	}

	public void setQtdadeHoras(double qtdadeHoras) {
		this.qtdadeHoras = qtdadeHoras;
	}

	public double getValorHoraTrabalhada() {
		return valorHoraTrabalhada;
	}

	public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	
	

}
