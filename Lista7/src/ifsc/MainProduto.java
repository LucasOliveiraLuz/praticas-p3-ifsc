package ifsc;

import java.util.ArrayList;


public class MainProduto {

	public static void main(String[] args) {
		
		Desktop p = new Desktop();
		
		p.setFabricante("Herculano");
		p.setCodBarras((long) (234));
		p.setGamer(true);
		
		Desktop p2 = new Desktop();
		
		p2.setFabricante("Pablo");
		p2.setCodBarras((long) (598));
		p2.setGamer(false);
		
		Desktop p3 = new Desktop();
		
		p3.setFabricante("Dimitri");
		p3.setCodBarras((long) (949));
		p3.setGamer(false);
		
		Smarthphone s = new Smarthphone();
		
		s.setFabricante("Gustavo");
		s.setDimensoesTela("Grande");
		s.setQualidadeTela("Alta");
		
		Smarthphone s2 = new Smarthphone();
		
		s2.setFabricante("Lucas");
		s2.setDimensoesTela("Pequena");
		s2.setQualidadeTela("Alta");
		
		Smarthphone s3 = new Smarthphone();
		
		s3.setFabricante("Carlos");
		s3.setDimensoesTela("Média");
		s3.setQualidadeTela("Baixa");
		
		ArrayList<Smarthphone> Smarthphone = new ArrayList<>(3);
		
		Smarthphone.add(s);
		Smarthphone.add(s2);
		Smarthphone.add(s3);
		
		ArrayList<Desktop> Desktop = new ArrayList<>(3);
		
		Desktop.add(p);
		Desktop.add(p2);
		Desktop.add(p3);
		
		for(Desktop fac: Desktop) {
			System.out.println(fac.getFabricante());
			System.out.println(fac.getCodBarras());
			System.out.println(fac.getGamer() + "\n");
		}
		
		for(Smarthphone tela: Smarthphone) {
			System.out.println(tela.getFabricante());
			System.out.println(tela.getDimensoesTela());
			System.out.println(tela.getQualidadeTela() + "\n");
		}
		
		
		
	}

}
