package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		carro.setNome("Camaro");
		carro.setAno(1976);
		carro.setCor("Vermelho");
		carro.setFabri("FordK");
		carro.setnRoda(4);
		
		Veiculo carro2 = new Veiculo();
		carro2.setNome("Moto");
		carro2.setAno(2000);
		carro2.setCor("Preto");
		carro2.setFabri("V8");
		carro2.setnRoda(2);
		
		Veiculo carro3 = new Veiculo();
		carro3.setNome("Ferrari");
		carro3.setAno(1996);
		carro3.setCor("Vermelho");
		carro3.setFabri("FordK");
		carro3.setnRoda(4);
		
		ArrayList<Veiculo> nomeLista =  new ArrayList<>();
		nomeLista.add(carro);
		nomeLista.add(carro2);
		nomeLista.add(carro3);

		for (Veiculo veiculo : nomeLista) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getFabri());
			System.out.println(veiculo.getnRoda()) ;
		}
	}

}
