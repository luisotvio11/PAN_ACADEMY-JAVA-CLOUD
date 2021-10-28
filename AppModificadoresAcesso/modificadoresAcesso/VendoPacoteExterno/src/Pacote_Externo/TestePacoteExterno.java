package Pacote_Externo;

import br.com.pacote.*;

public class TestePacoteExterno {
	
	public static void main(String[] args) {
		
		Produto prodLuva = new Produto ();
		prodLuva.nomeProd = "Luva";
		System.out.println(prodLuva.getNome());
	}

}
