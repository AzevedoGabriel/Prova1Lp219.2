
public class Corrida {
	
	private String nomeCorrida;
	private String data;
	private int qtdparticipantes;
	private Chip[] corredores;
	private Chip chip;
	private int codigoChip;
	private String estado;



	public Corrida(String nomeCorrida2, String data2, int qtdParticipantes2) {
		if (nomeCorrida ==  null || nomeCorrida.trim().equals("")) {
			throw new RuntimeException ("Nome da corrida não pode ser nulo/vazio!");
		}
		if (data ==  null || data.trim().equals("")) {
			throw new RuntimeException ("Data não pode ser nula/vazia!");
		}
		this.nomeCorrida = nomeCorrida;
		this.data = data;
		this.corredores = new Chip[qtdparticipantes];
		this.estado = "NAO_CONCLUIDA";
	}
	
	public void cadastraChip() {
		Chip c = new Chip(codigoChip, 0, 0);
		corredores[codigoChip] = c;
		this.codigoChip++;
	}
	
	public String getNomeCorrida() {
		return  this.nomeCorrida;
	}
	
	public int getCodigoChip() {
		return this.codigoChip;	
	}
	
	public void setEstado() {
		this.estado = "CONCLUIDA";
	}
	
	public int getChips() {
		int cont = 0;
		for (int i = 0; i < qtdparticipantes; i++) {
			if (corredores[i] != null) {
				cont += 1;
			}
		}
		return cont;
	}
	
	public String getEstado() {
		return this.estado;
	}

	public String chipString() {
		return chip.toString();
	}
	
	public String toString() {
		return nomeCorrida + " - " + data + " - " + estado;
	}
	
}
