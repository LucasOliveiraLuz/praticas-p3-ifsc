package ifsc;

public class Gato extends Animal {
	
	private String apelido;
	
	private String pedigree;
	
	private Tutor Tutor;
	
	public Tutor getTutor() {
		return Tutor;
	}
	public void setTutor(Tutor tutor) {
		Tutor = tutor;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getPedigree() {
		return pedigree;
	}
	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}
	
	
	
}
