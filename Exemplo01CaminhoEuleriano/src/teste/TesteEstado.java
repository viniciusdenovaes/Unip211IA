package teste;

import dao.InputInstance;
import entity.Estado;
import entity.grafo.Caminho;
import entity.grafo.Grafo;
import entity.grafo.ParArestaVertice;
import entity.grafo.Vertice;

public class TesteEstado {
	
	public static void main(String[] args) {
		Grafo g = InputInstance.getInstance("files/inst-pontes-konis.in");
		Caminho c = new Caminho(g.getVertice("i1"));
		c.addPar(
				new ParArestaVertice(
						g.getAresta("p1"), 
						g.getVertice("i2")));
		c.addPar(
				new ParArestaVertice(
						g.getAresta("p4"), 
						g.getVertice("m1")));
		Estado e = new Estado(c);
		System.out.println(e);
		System.out.println(e.isValido());
		c.addPar(
				new ParArestaVertice(
						g.getAresta("p4"), 
						g.getVertice("i2")));
		e = new Estado(c);
		System.out.println(e);
		System.out.println(e.isValido());
	}

}
