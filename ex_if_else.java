import java.util.Scanner; //Biblioteca para capturar algum valor digitado 
public class ex_if_else {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); // Criando vsriavel Scanner - System.in é entrada
		
		System.out.print("Digite sua idade"); // System.out.print - é o texto de saída 
		String idade = scanner.next(); // Variavel para armazenar o valor digitado
		
		if (idade <18) { // condicional SE
			System.out.print("Acesso negado: menor de idade");
		} else { // condicional SE NÂO
			System.out.print("Acesso permitido");
		}
		
	}

}
