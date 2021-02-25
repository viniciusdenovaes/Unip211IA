package entity;

import java.util.Set;
import java.util.TreeSet;

import entity.grafo.Aresta;
import entity.grafo.Caminho;
import entity.grafo.ParArestaVertice;

public class Estado {
	
	Caminho caminho;
	
	public Estado(Caminho aCaminho) {
		this.caminho = aCaminho;
	}
	
	public boolean isValido() {
		boolean res = true;
		
		Set<Aresta> arestas = new TreeSet<>();
		for(ParArestaVertice par: this.caminho.caminho) {
			Aresta a = par.a;
			if(arestas.contains(a)) {
				return false;
			}
			arestas.add(a);
		}
		
		return res;
	}
	
	public boolean isObjetivo() {
		return false;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += this.caminho;
		return res;
	}

}
