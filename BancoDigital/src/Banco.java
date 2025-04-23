import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
    public void impressaoContasDoBanco(){
        System.out.println("Impressão das contas dos clientes do banco " + getNome() +":");
        for (Conta c : contas){
            System.out.println("Nome: " + getNome());
            System.out.println("Agência: " +c.agencia);
            System.out.println("Número da Conta: " +c.numero);
            System.out.printf("Saldo da conta: %.2f\n",c.saldo);
            // c.imprimirInfosComuns();
            System.out.println();
        }
    }

}
