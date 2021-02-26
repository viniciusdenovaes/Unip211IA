package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entity.estruturas.EstadoAbertos;
import entity.estruturas.Fila;
import entity.estruturas.Pilha;
import entity.grafo.Caminho;
import entity.grafo.Grafo;
import entity.grafo.Vertice;

public class EspacoEstados {
	
	Grafo grafo;
	
	List<Estado> estadosIniciais;
	
	EstadoAbertos estadosAbertos = new Fila();
	
	public EspacoEstados(Grafo g) {
		this.grafo = g;
		
		estadosIniciais = new ArrayList<>();
		for(Vertice v: g.getTodosVertices()) {
			Caminho c = new Caminho(v);
			Estado estadoInicial = new Estado(g, c);
			estadosIniciais.add(estadoInicial);
		}
		
		for(Estado e: estadosIniciais) {
			estadosAbertos.push(e);
		}
	}
	
	public Estado solve() {
		while(estadosAbertos.size()>0) {
			Estado estado = estadosAbertos.pop();
			System.out.println("tentando resolver");
			System.out.println(estado);
			System.out.println();
			if(estado.isObjetivo()) {
				System.out.println("Solucao encontrada");
				return estado;
			}
			for(Estado e: estado.geraFilhos()) {
				estadosAbertos.push(e);
			}
		}
		System.out.println("Nao encontramos solucao!!");
		return null;
	}
	
	

}
