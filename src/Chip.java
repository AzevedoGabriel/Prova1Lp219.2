
public class Chip {
	
	private int codigoChip;
	private int distanciakm;
	private int tempoGasto;
	private int velocidadeMedia;
	
	public Chip(int codigoChip, int distanciakm, int tempoGasto) {
		this.codigoChip = codigoChip;
		this.distanciakm = distanciakm;
		this.tempoGasto = tempoGasto;
		
	}
	
	public int getCodigoChip() {
		return this.codigoChip;
	}
	
	public int getVelocidadeMedia() {
		return this.velocidadeMedia = distanciakm / tempoGasto;
	}
	
	public String toString() {
		return codigoChip + " - " + distanciakm + " - " + tempoGasto;
	}

	public int getDistanciakm() {
		return distanciakm;
	}

	public void setDistanciakm(int distanciakm) {
		this.distanciakm = distanciakm;
	}

	public int getTempoGasto() {
		return tempoGasto;
	}

	public void setTempoGasto(int tempoGasto) {
		this.tempoGasto = tempoGasto;
	}

	
}
