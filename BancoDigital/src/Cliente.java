public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String tipoConta;

    public String getNome() {
    	return nome;
	}
    
    public Cliente(String nome, String cpf, String endereco, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.tipoConta = tipoConta;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }

}