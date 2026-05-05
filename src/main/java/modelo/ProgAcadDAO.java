package modelo;

// Ivonne Alejandra Gualtero Arana


import java.util.ArrayList;

public class ProgAcadDAO {

	public static ArrayList<ProgAcad> lista_P = new ArrayList<ProgAcad>();

	public static void cargaDatos() {
		if (lista_P.isEmpty()) {
			lista_P.add(new ProgAcad(1, "Ingeniería de Sistemas"));
			lista_P.add(new ProgAcad(2, "Ingeniería Industrial"));
			lista_P.add(new ProgAcad(3, "Matemática"));
			lista_P.add(new ProgAcad(4, "Administración de Empresas"));
			lista_P.add(new ProgAcad(5, "Derecho"));
			lista_P.add(new ProgAcad(6, "Ingeniería Telemática"));
		}
	}
}