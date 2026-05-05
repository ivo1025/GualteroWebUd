package beanCDT;

import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import modeloCDT.CDT;
import modeloCDT.CDTDAO;

@Named("cdt")
@ViewScoped
public class CDTBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private CDT dto = new CDT();

	public CDTBean() {
	}

	public CDT getDto() {
		return dto;
	}

	public void setDto(CDT dto) {
		this.dto = dto;
	}

	public void calcular() {

		CDTDAO.calcular(dto);

		System.out.println("Ganancia: " + dto.getGanancia());
	}
}