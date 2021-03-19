package teste;

import dao.InputInstance;
import entity.Estado;
import entity.Tabuleiro;
import entity.estruturas.Fila;
import solver.EspacoDeEstados;

public class TesteEstadoSolver {
	
	public static void main(String[] args) {
		Tabuleiro t = InputInstance.getInstance("files/inst02.in");
		Estado e = new Estado(t);
		System.out.println("Começando com o estado ");
		System.out.println(e);
		
		EspacoDeEstados ee = new EspacoDeEstados(e, new Fila());
		Estado solucao = ee.solve();
		System.out.println(e);
		
		
		
	}

}
