import java.util.Scanner;
public class MenuLanchonete {

	public static void main(String[] args) {
		Scanner v = new Scanner (System.in);
		
		System.out.println("Menu da lanchonete");
		System.out.println("1 - Hamburguer");
		System.out.println("2 - Batat Frita");
		System.out.println("3 - Risoles");
		System.out.println("4 - Refrigerante");
		System.out.print("Digite a opção desejada");
		int opçao = v.nextInt();
		
		switch (opçao) {
		case 1:
			System.out.println("Você escolheu: Hamburguer");
			break;
		case 2:
			System.out.println("Você escolheu: Batata Frita");
		case 3:
			System.out.println("Você escolheu: risoles");
		case 4:
			System.out.println("Você escolheu: refrigerante");
			break;
			default:
				System.out.println("Opção Invalida!");
				break;
		}
		
	}

}
