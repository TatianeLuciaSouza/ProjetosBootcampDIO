import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Banco banco = new Banco();
        
        System.out.print("Digite o nome do banco: ");
        String nomeDoBanco = scanner.nextLine();
        
        banco.setNome(nomeDoBanco);
        List<Conta> listaDeContas = new ArrayList<>();
        
        String nomeCliente, cpfCliente, telefoneCliente, tipoConta;
        int op1 = 0, op2 = 0;
        char opSimOuNao;
        double valorDeposito;
        
        tipoConta = null;
        Conta cc1 = null;
        Conta cp1 = null;

        Cliente cliente1 = null;
        
        banco.setNome(nomeDoBanco);

        System.out.printf("Digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o cpf do Cliente: ");
        cpfCliente = scanner.nextLine();
    
        System.out.println("Digite o telefone do Cliente: ");
        telefoneCliente = scanner.nextLine();
        
        System.out.println("Escolha o tipo da conta do cliente: ");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("Digite a opção da conta:");
        int opcaoConta = scanner.nextInt();
        
        System.out.println("Digite o valor do depósito da conta " + nomeCliente + ":");
        valorDeposito = scanner.nextDouble();
        
        if(opcaoConta == 1){
            op1 = 1;
            cliente1 = new Cliente(nomeCliente, cpfCliente, telefoneCliente, tipoConta);
            cc1 = new ContaCorrente(cliente1);
            cc1.depositar(valorDeposito);
        } else if (opcaoConta==2) {
            op1 = 2;;
            cliente1 = new Cliente(nomeCliente, cpfCliente, telefoneCliente, tipoConta);
            cp1 = new ContaPoupanca(cliente1);
            cp1.depositar(valorDeposito);
        }
        scanner.nextLine();
        
        if (op1 == 1){
            System.out.printf("Gostaria de fazer um deposito na conta corrente %s: S - Sim ou N - Não\n",cc1.cliente.getNome());
            opSimOuNao = scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Digite o valor do depósito na conta %s:\n", cc1.cliente.getNome());
                valorDeposito = scanner.nextDouble();    
            }
            
            listaDeContas.add(cc1);
            System.out.println(cc1);
            banco.setContas(listaDeContas);

        }else if (op2 == 2){
            System.out.printf("Gostaria de fazer um deposito na conta poupança %s: S - Sim ou N - Não\n",cc1.cliente.getNome());
            opSimOuNao =scanner.next().toUpperCase().charAt(0);
            if (opSimOuNao =='S'){
                System.out.printf("Digite o valor do depósito na conta %s:\n", cc1.cliente.getNome());
                 valorDeposito = scanner.nextDouble();
                cc1.depositar(valorDeposito);
            }
            
            listaDeContas.add(cp1);
            System.out.println(cp1);
            banco.setContas(listaDeContas);

        }
        banco.impressaoContasDoBanco();
        scanner.close();
    }
}