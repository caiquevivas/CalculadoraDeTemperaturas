package conversor;
import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float temperatura;
		int seleção;
		System.out.println("se quiser converter kelvin em celsius digite 1");
		System.out.println("se quiser converter kelvin em fahrenheit digite 2");
		System.out.println("se quiser converter celsius em kelvin digite 3");
		System.out.println("se quiser converter celsius em fahrenheit digite 4");
		System.out.println("se quiser converter fahrenheint em celsius digite 5");
		System.out.println("se quiser converter fahrenheint em kelvin digite 6");
		System.out.print("digite o numero: ");
		seleção = ler.nextInt();
		
		switch(seleção) {
		   case 1:
			   System.out.print("Digite a temperatura em Kelvin: ");
			   temperatura = ler.nextFloat();
			   temperatura = temperatura - 273.15f;
			   System.out.println("A temperatura em celsius é: " + temperatura);
			   break;
		   case 2:
			   System.out.print("Digite a temperatura em Kelvin: ");
			   temperatura = ler.nextFloat();
			   temperatura = (temperatura - 273.15f)* 9f/5f + 32f;
			   System.out.println("A temperatura em fahrenheit é: " + temperatura);
			   break;
		   case 3:
			   System.out.print("Digite a temperatura em celsius: ");
			   temperatura = ler.nextFloat();
			   temperatura = (float) (temperatura + 273.15);
			   System.out.println("A temperatura em kelvin é: " + temperatura);
			   break;
		   case 4:
			   System.out.print("Digite a temperatura em celsius: ");
			   temperatura = ler.nextFloat();
			   temperatura = (temperatura * 9f/5f) + 32f;
			   System.out.println("A temperatura em fahrenheit é: " + temperatura);
			   break;
		   case 5:
			   System.out.print("Digite a temperatura em fahrenheint: ");
			   temperatura = ler.nextFloat();
			   temperatura = (temperatura - 32f) * 5f/9f;
			   System.out.println("A temperatura em celsius é: " + temperatura);
			   break;
		   case 6:
			   System.out.print("Digite a temperatura em fahrenheint: ");
			   temperatura = ler.nextFloat();
			   temperatura = ((temperatura - 32f) * 5f/9f) + 273.15f;
			   System.out.println("A temperatura em kelvin é: " + temperatura);
			   break;

		}
	}
}
