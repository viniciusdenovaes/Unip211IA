package teste;

import dao.InputInstance;
import entity.EspacoEstados;
import entity.Estado;
import entity.grafo.Grafo;

public class TesteBuscaEspacoEstados {
	
	public static void main(String[] args) {
		Grafo g = InputInstance.getInstance("files/inst-pontes-konis.in");
		EspacoEstados ee = new EspacoEstados(g);
		Estado solucao = ee.solve();
		
		if(solucao==null) {
			System.out.println("solucao null");
		}else {
			System.out.println("Solucao ");
			System.out.println(solucao);
		}
	}

}
