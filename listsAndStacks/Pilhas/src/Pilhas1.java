import java.util.Stack;

public class Pilhas1 {
	
		public static void main(String[] args) {
			
			Stack<Integer> pilha = new Stack <> ();
			
			boolean result = pilha.empty();
			
			
			System.out.println("A pilha está vazia?" + result);
			
			pilha.push(68); // coloca
			pilha.push(118);
			pilha.push(90);
			pilha.push(720);
			pilha.pop();
			pilha.pop();
			
			System.out.println("Elementos do meu stack" + pilha);
			result = pilha.empty();
			System.out.println("Está vazio?" + result);
	}

}



