import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

	public static void main(String[] args) throws Exception {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o promeiro parametro: ");
		int parametroum = ler.nextInt();
		
		System.out.print("Digite o promeiro parametro: ");
		int parametrodois = ler.nextInt();
		
		try {
			contar(parametroum, parametrodois);
		}catch(ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		ler.close();
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {	
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	    }
	    for (int i = parametroUm; i < parametroDois; i++) {
	    		System.out.println("Imprimindo o número " + i);
	    }
	}
}
