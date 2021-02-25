package entity.grafo;

import java.util.ArrayList;
import java.util.List;

public class Caminho {
	
	public Vertice inicial;
	public List<ParArestaVertice> caminho;
	Vertice ultimoVertice; 
	
	public Caminho(Vertice aInicial) {
		this.inicial = aInicial;
		this.ultimoVertice = aInicial;
		caminho = new ArrayList<>();
	}
	
	public void addPar(ParArestaVertice pav) {
		caminho.add(pav);
		ultimoVertice = pav.v;
	}
	
	public Vertice ultimoVertice() {
		return this.ultimoVertice;
	}
	
	public boolean isArestaIn(Aresta a) {
		for(ParArestaVertice pav : caminho) {
			if(a.equals(pav.a)) return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += this.inicial + " ";
		for(ParArestaVertice par: this.caminho) {
			res += par + " ";
		}
		return res;
	}
	

}




