package solver.heuristica_avaliacao;

import entity.Estado;

public class HeuristicaAvaliacaoInteligente implements HeuristicaAvaliacao {
	
	HeuristicaAvaliacao heuristicaAvaliacao;

	public HeuristicaAvaliacaoInteligente(HeuristicaAvaliacao aHeuristicaAvaliacao) {
		this.heuristicaAvaliacao = aHeuristicaAvaliacao;
	}

	@Override
	public double avaliaEstado(Estado estado) {
		double notaNivel = new HeuristicaAvaliacaoNivel().avaliaEstado(estado);
		double notaAvaliacao = this.heuristicaAvaliacao.avaliaEstado(estado);
		double nota = notaNivel + notaAvaliacao; 
		return nota;
	}
	
}
