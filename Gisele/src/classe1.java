import java.util.Scanner;

public class classe1 {

	public static void main(String[] args) {
		
		
		String nome, cidade;
		int idade;
		
			
		
		Scanner leitor = new Scanner (System.in);
		
		
		
		System.out.println("Digite seu nome: ");
		nome =  leitor.next();
		
		
		
		
		
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt(); 
		
		
		
		System.out.println("Digite sua cidade: ");
		cidade =  leitor.next();
		
		
		
		System.out.println("Boas vindas, "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Cidade: "+cidade);
		
		

	}

}
