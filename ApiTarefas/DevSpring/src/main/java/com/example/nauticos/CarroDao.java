package com.example.nauticos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CarroDao {

	
			private static List<Carro>  carros;
			
			public CarroDao () {
				
				criarCarros ();
			}
			
			
			private void criarCarros () {
				
				if (carros == null) {
					
					carros = new ArrayList<Carro>();
					
					carros.add(new Carro("Focus","Ford",2016));
					carros.add(new Carro("Linea","Fiat",2014));
					carros.add(new Carro("Jetta","Chevrolet",2016));
					carros.add(new Carro("Cruze	","Chevrolet",2016));
					}
			}
			
			
			public List <Carro> getCarros () {
				
				return carros;
			}
}
