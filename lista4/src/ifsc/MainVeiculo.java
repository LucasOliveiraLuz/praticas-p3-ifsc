package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo p = new Veiculo();
		p.setNome("Opala");
		p.setAno(2000);
		p.setFabricante("Gustavo");
		p.setCor("Azuç");
		
		Veiculo a = new Veiculo();
		a.setNome("Opala");
		a.setAno(1989);
		a.setFabricante("Gustavo");
		a.setCor("preto");
		
		Veiculo b = new Veiculo();
		b.setNome("Opala");
		b.setAno(1980);
		b.setFabricante("Gustavo");
		b.setCor("vermelho");
		
		ArrayList <Veiculo> test = new ArrayList<>();
		test.add(p);
		test.add(a);
		test.add(b);
		
		for (Veiculo veiculo : test) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("|||||||||||||||||");
			
		}
		
		

	}

}
