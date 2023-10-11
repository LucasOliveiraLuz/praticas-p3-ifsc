package lista5;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		p.setNome("Hot Dog");
		p.setCodBarras((long)(173));
		p.setPreco (12.50);
		p.setFornecedor("Dimitri");
		
		Produto p_2 = new Produto();
		
		p_2.setNome("Orelha de Gato");
		p_2.setCodBarras((long)(798));
		p_2.setPreco (4.50);
		p_2.setFornecedor("Lucas");
		
		Produto p_3 = new Produto();
		
		p_3.setNome("Flié de espada");
		p_3.setCodBarras((long)(456));
		p_3.setPreco (7.99);
		p_3.setFornecedor("Seu Zé");
		
		ArrayList<Produto> infos = new ArrayList<>(3);
		
			infos.add(p);
			infos.add(p_2);
			infos.add(p_3);
			
		for(Produto p_4: infos) {
			System.out.println(p_4.getNome());
			System.out.println(p_4.getCodBarras());
			System.out.println(p_4.getPreco());
			System.out.println(p_4.getFornecedor());
			
		}
		
		
	}

}
