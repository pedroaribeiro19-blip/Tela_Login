import java.util.Scanner; //Biblioteca para capturar entrada pelo teclado
public class CalculadoraDesconto {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in); // variavel para criar o Scanner 
		
		System.out.print("Digite o valor total da compra R$:");//interação com o usuario
		double valorCompra = p.nextDouble();//capturar o proximo valor inteiro ou quebrado
		double desconto = 0;// iniciarmos a variavel com o valor 0
		if (valorCompra > 100) { // condicional SE
			desconto = valorCompra * 0.10;// atribui um valor de 10 a variavel descnto
			System.out.print("Você ganhou 10% de desconto");//menssagem na tela para o usuario
		}else if (valorCompra >= 50) { // condicional SENAO SE 
			desconto = valorCompra * 0.05;//atribui um valor de 5 a variavel desconto
			System.out.print("Você ganou 5% de desconto");//menssagem na tela para o usuario
		}else {
			System.out.print("Sem desconto para esse valor");// menssagem na tela para o usuario
		}
		double valorfinal = valorCompra - desconto;// subtrai o valor da compra do desconto e atribui a variavel valor final
		System.out.printf("Valor final a pagar: R$ %.2f\n", valorfinal);// mostre a menssagem do valor final com 2 casas após a virgula 
		
	}

}
