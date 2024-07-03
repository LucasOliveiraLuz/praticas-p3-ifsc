package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Tutor Alex = new Tutor();
		Alex.setNomeCompleto("Alex Ferreira");
		
		Tutor Lucas = new Tutor();
		Lucas.setNomeCompleto("Lucas Oliveira");
		
		Tutor Carlos = new Tutor();
		Carlos.setNomeCompleto("Carlos Soares");
		
		Gato Blecaute = new Gato();
		Blecaute.setApelido("Blecaute");
		Blecaute.setClasse("Siames");
		Blecaute.setNomeCientifico("origuntangus");
		Blecaute.setPedigree("Peixe");
		
		Gato Morangin = new Gato();
		Morangin.setApelido("Morangin");
		Morangin.setClasse("Cardial");
		Morangin.setNomeCientifico("Cardilangutango");
		Morangin.setPedigree("Frango");
		
		Gato Meianoite = new Gato();
		Meianoite.setApelido("Meianoite");
		Meianoite.setClasse("Darkness");
		Meianoite.setNomeCientifico("Obscuriate");
		Meianoite.setPedigree("carne");
		
		Lucas.adicionarGato(Blecaute);
		Alex.adicionarGato(Morangin);
		Carlos.adicionarGato(Meianoite);
		
		ArrayList<Tutor> Tutores = new ArrayList<>();
		Tutores.add(Alex);
		Tutores.add(Lucas);
		Tutores.add(Carlos);
		
		for (Tutor tutor : Tutores) {
			System.out.println("Tutor: " + tutor.getNomeCompleto());
				for (Gato Gato : tutor.getGatinhos()) {
					System.out.println("Gato: " + Gato.getApelido());
					System.out.println("Gato: " + Gato.getClasse());
					System.out.println("Gato: " + Gato.getNomeCientifico());
					System.out.println("Gato: " + Gato.getPedigree());
					System.out.println("---------------------------");
					
				}
		}
		
		
		

	}

}
