package teste;

import dao.InputInstance;
import entity.EspacoEstados;
import entity.estruturas.Pilha;
import global.Global;

public class TesteSolve {
	
	public static void main(String[] args) {
		Global.grafo = InputInstance.getInstance("files/mapa.in");
		EspacoEstados ee = new EspacoEstados(new Pilha());
		ee.solve();
	}

}
