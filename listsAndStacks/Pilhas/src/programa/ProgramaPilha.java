package programa;

import java.util.Stack;

public class ProgramaPilha extends pilhaRepo {
	
		public static void main(String[] args) {
			
			
			Stack <String> pilhinha = new Stack<>();
			
			System.out.println("Stack" + pilhinha);

			
			inserindoPush(pilhinha, "Caixa Acustica 110");
			inserindoPush(pilhinha, "Caixa Acustica 120");
			inserindoPush(pilhinha, "Note");
			deletandoPop(pilhinha);
			deletandoPop(pilhinha);

			

			
			
		}
		

}


