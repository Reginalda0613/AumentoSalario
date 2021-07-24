package entidades;

public class Empregado {
	public String nome;
	public double brutoSalario;
	public double tax;
	public double netSalario() {
	return brutoSalario - tax;
	}
	public void aumentarSalario(double porcentagem) {
	brutoSalario += brutoSalario * porcentagem / 100.0;
	}
	public String toString() {
	return nome + ", $ " + String.format("%.2f", netSalario());
	}


}
