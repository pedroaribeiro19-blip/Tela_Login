import java.util.Scanner;
public class validacaosenha {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String senhacorreta = "123";
		String senhadigitada = "";
		
		while (!senhadigitada.equals(senhacorreta)) {
			senhadigitada = e.next();
			
			if (!senhadigitada.equals(senhacorreta)) {
				System.out.print("senha incorreta, tente novamente");
			}
		}
		System.out.println("Acesso concedido!");
		

	}

}
