import java.util.Scanner;

public class Codigo {
	
	public static void main (String[] args) {
			
		Scanner read = new Scanner(System.in);
		
		System.out.println("DIGITE A MENSAGEM DESCRIPTOGRAFADA: ");
		
		String sentence = read.nextLine();
		
		sentence = sentence.toLowerCase();
		
		System.out.println("DIGITE O VALOR DO SALTO DE LETRAS: ");
		
		int shift = read.nextInt();
		
		while (shift >= 26) {
			
			shift = shift - 26;
			
		}
		
		for (int i = 0; i < sentence.length(); i++) {
			
			if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
				
				if(sentence.charAt(i) + shift > 'z') { 
				
					char local1 = (char)(sentence.charAt(i) + shift);
					
					char local2 = (char)(local1 - 'z');
					
					char ascii = (char)('`' + local2);
					
					System.out.print(ascii);
						
				}else 
					
					if((sentence.charAt(i) + shift) < 'a') { 
				
					char local1 = (char)(sentence.charAt(i) + shift);
					
					char local2 = (char)(local1 - 'a');
					
					char ascii = (char)('{' + local2);
					
					System.out.print(ascii);
				
			}else {
   				
				char ascii = (char)(sentence.charAt(i) + shift);
	
				System.out.print(ascii);
				
				}
				 
			}
			
			if (sentence.charAt(i) == ' ') {
				
				char ascii = (char) (' ');
				
				System.out.print(ascii);
				
			}
		
		}
	
	}
	
}
