package ifsc;

public abstract class Produto {
	
	private String fabricante;
	private Long CodBarras;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Long getCodBarras() {
		return CodBarras;
	}
	public void setCodBarras(Long codBarras) {
		CodBarras = codBarras;
	}
	
	
}
