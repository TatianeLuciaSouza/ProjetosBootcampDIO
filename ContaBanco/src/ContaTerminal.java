
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Oi");
		
		int numero = 0;
		String agencia = null;
		String nmCliente = null;
		double saldo = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Por favor, digite o número da Agencia: ");
		agencia = ler.next();
		
		System.out.print("Por favor, digite o número da conta: ");
		numero = ler.nextInt();
		
		System.out.print("Por favor, digite seu nome: ");
		nmCliente = ler.next();
		
		System.out.print("Por favor, digite o saldo inicial de sua conta: ");
		saldo = ler.nextDouble();
		
		System.out.println("Olá " + nmCliente + ", obrigada por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");
	}

}
