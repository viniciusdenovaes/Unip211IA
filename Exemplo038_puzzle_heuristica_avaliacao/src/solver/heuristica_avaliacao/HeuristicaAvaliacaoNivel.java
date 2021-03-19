package solver.heuristica_avaliacao;

import entity.Estado;

public class HeuristicaAvaliacaoNivel implements HeuristicaAvaliacao {

	@Override
	public double avaliaEstado(Estado estado) {
		double nota = estado.getNivel();
		return nota;
	}

}
