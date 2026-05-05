package modeloCDT;

import java.io.Serializable;
import java.util.Objects;

public class CDT implements Serializable {

	private static final long serialVersionUID = 1L;

	private double inversion;
	private double interes;
	private double plazo;
	private double ganancia;
	private double valorFuturo;
	private double impuesto;

	public CDT() {
	}

	public CDT(double inversion, double interes, double plazo) {
		this.inversion = inversion;
		this.interes = interes;
		this.plazo = plazo;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getPlazo() {
		return plazo;
	}

	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}

	public double getGanancia() {
		return ganancia;
	}

	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}

	public double getValorFuturo() {
		return valorFuturo;
	}

	public void setValorFuturo(double valorFuturo) {
		this.valorFuturo = valorFuturo;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ganancia, impuesto, interes, inversion, plazo, valorFuturo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CDT other = (CDT) obj;
		return Double.doubleToLongBits(ganancia) == Double.doubleToLongBits(other.ganancia)
				&& Double.doubleToLongBits(impuesto) == Double.doubleToLongBits(other.impuesto)
				&& Double.doubleToLongBits(interes) == Double.doubleToLongBits(other.interes)
				&& Double.doubleToLongBits(inversion) == Double.doubleToLongBits(other.inversion)
				&& Double.doubleToLongBits(plazo) == Double.doubleToLongBits(other.plazo)
				&& Double.doubleToLongBits(valorFuturo) == Double.doubleToLongBits(other.valorFuturo);
	}

	@Override
	public String toString() {
		return "CDT [inversion=" + inversion + ", interes=" + interes + ", plazo=" + plazo + ", ganancia=" + ganancia
				+ ", valorFuturo=" + valorFuturo + ", impuesto=" + impuesto + "]";
	}
	
	
	
}