package teste;

import java.util.Collection;

import dao.InputInstance;
import entity.EspacoDeEstados;
import entity.Estado;
import entity.Tabuleiro;

public class TesteEstadoSolver {
	
	public static void main(String[] args) {
		Tabuleiro t = InputInstance.getInstance("files/inst01.in");
		Estado e = new Estado(t);
		
		EspacoDeEstados ee = new EspacoDeEstados(e);
		Estado solucao = ee.solve();
		System.out.println(e);
		
		
		
	}

}
