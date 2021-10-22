package Listas;

import java.util.ArrayList;
import java.util.HashMap;

public class AquecimentoListaArray {

	
		public static void main(String[] args) {
			
			HashMap<String, String> hashMapinho = new HashMap <> ();
			
			hashMapinho.put("procuro", "fui achado hash"); // sempre adicionar como Put
			hashMapinho.put("procuro2", "fui achado hash2");
			
			String value = hashMapinho.get("procuro");
			System.out.println(value);
			
			
			ArrayList<String> lista = new ArrayList <> (); // array list usa add
			lista.add("topico 1 da lista me achou");
			lista.add("Topico 2 da lista me achou");
			
			String str1 = lista.get(0); // str1 recebera "St
			
			System.out.println(str1);
		
			
		}
		}
