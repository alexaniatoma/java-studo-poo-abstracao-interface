package abstracao;

public abstract class Colaborador {
	
	private String nome;
	private String cargo;
	private double salarioBruto;
	
	abstract double calcularSalario();
	
	public double calcularSalarioLiquido() {
		return this.calcularSalario();
		
	};
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	

}
