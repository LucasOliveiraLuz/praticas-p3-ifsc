package ifsc;

import java.util.ArrayList;

public class Tutor {
	private ArrayList<Gato> Gatinhos = new ArrayList<>();
	public ArrayList<Gato> getGatinhos() {
		return Gatinhos;
	}
	
	

	private String nomeCompleto;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public void adicionarGato(Gato gatinho) {
		this.Gatinhos.add(gatinho);
		gatinho.setTutor(this);
	}
}

