package dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import entity.EspacoEstados;
import entity.Estado;
import entity.grafo.Aresta;
import entity.grafo.Grafo;
import entity.grafo.Vertice;

public class InputInstance {
	
	public static Grafo getInstance(String file) {
		
		Grafo grafo = new Grafo();
	
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		try {
			
			is = new FileInputStream(file);
			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			br = new BufferedReader(isr);
			String line;
			line = br.readLine();
			int numeroArestas = Integer.parseInt(line);
			for(int i=0; i<numeroArestas; i++) {
				line = br.readLine();
				String[] dados = line.split(" ");
				Vertice v1 = new Vertice(dados[0]);
				Vertice v2 = new Vertice(dados[1]);
				double peso = Double.parseDouble(dados[2]);
				grafo.addAresta(new Aresta(v1, v2, peso));
			}
			line = br.readLine();
			EspacoEstados.estadoInicial = new Estado(new Vertice(line));
			line = br.readLine();
			EspacoEstados.estadoObjetivo = new Estado(new Vertice(line));
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return grafo;
		
	}

}

