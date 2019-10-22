
public class ProgRunningManager {
	
	private Corrida[] corridas;
	private Corrida corrida;
	private int indice;
	private Chip chip;
	
	public ProgRunningManager() {
		this.corridas = new Corrida[50];
	}
	
	public void cadastrarCorrida(String nomeCorrida, String data, int qtdParticipantes) {
		Corrida c = new Corrida(nomeCorrida, data, qtdParticipantes);
		corridas[indice] = c;
		indice++;
	}
	
	public int cadastrarChipCorrida(String nomeCorrida) {
		for (int i = 0; i < 50; i++ ) {
			if (corridas[i] != null) {
				if (nomeCorrida.equals(corrida.getNomeCorrida())) {
					corrida.cadastraChip();
					return corrida.getCodigoChip();
				}
			}
		}
		return 0;
	}
	
	public String listarCorrida(String nomeCorrida) {
		String listar= "";
		for (int i = 0; i < 50;i++) {
			if (corridas[i] != null) {
				Corrida c = corridas[i];
				if (c.getNomeCorrida().equals(nomeCorrida)) {
					listar += c.toString();
				}
			}
		}
		return listar;
	}
	
	public int contarChipsCorrida(String nomeCorrida) {
		for (int i = 0; i < 50; i++) {
			if (corridas[i] != null) {
				Corrida c = corridas[i];
				if (nomeCorrida.equals(c.getNomeCorrida())){
					return c.getChips();
				}
			}
		}
		return 0;
	}
	
	public String exibirCorredor(String nomeCorrida, int codigoChip) {
		String listar = "";
		for (int i = 0; i < 50; i++) {
			if (corridas[i] != null) {
				Corrida c = corridas[i];
				if (nomeCorrida.equals(c.getNomeCorrida())) {
					if (codigoChip == c.getCodigoChip()) {
						listar += chip.toString();					}
				}
			}
		}
		return listar;
	}
	
	public void atualizaChipDistanciaTempo(String nomeCorrida, int codigoChip, int distanciakm, int tempoMin){
		for (int i = 0; i < 50; i++) {
			if (corridas[i] != null) {
				Corrida c = corridas[i];
				if (nomeCorrida.equals(c.getNomeCorrida())) {
					if (codigoChip == c.getCodigoChip()) {
						chip.setDistanciakm(distanciakm);
						chip.setTempoGasto(tempoMin);
					}
				}
			}
		}
	}
	
	public void finalizarCorrida(String nomeCorrida) {
		for (int i = 0; i < 50; i++) {
			if (corridas[i] != null) {
				Corrida c = corridas[i];
				c.setEstado();
			}
		}
	}
	
	public int velocidadeMediaCorrida(String nomeCorrida) {
		for (int i = 0; i < 50; i++) {
			if (corridas[i] != null) {
				Corrida c = corridas[i];
				if (nomeCorrida.equals(c.getNomeCorrida())) {
					return chip.getVelocidadeMedia();
				}
			}
		}
		return 0;
	}
	
	public int menorTempoCorrida(String nomeCorrida) {
		int g = 0;
		int a = 0;
		for (int i = 0; i < 50; i++) {
			if (corridas[i] != null) {
				Corrida c = corridas[i];
				if (nomeCorrida.equals(c.getNomeCorrida())) {
					if ("CONCLUIDA".equals(c.getEstado())) {
						a += chip.getTempoGasto();
					}
				}
				if (g < a) {
					g = a;
				}
			}
		}
		return g;
	}
	
}
