import java.util.Random;
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
	Scanner scanner = new Scanner(System.in);

	public void ligar(String nome) {
		System.out.println("Discando...");
		do {
			System.out.println("Telefone tocando");

	    } while (tocando());

	    System.out.println("Al�, " + nome + "!!!");
	}

    @Override
    public void atender() {
        String contatos[] = {"Daniele", "Fernanda", "Leo", "Luana", "Lucas", "Rafael", "Thaiane"};
        Random contatoSelecionado = new Random();
        System.out.println("Ol� Marcos! � o/a " + contatos[contatoSelecionado.nextInt(contatos.length)] + " falando no celular!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz!");
    }

    @Override
    public void tocar(String musica) {
        System.out.println();
        System.out.println("Tocando a musica: " + musica);
        System.out.println();
        System.out.print("Deseja pausar a musica? ( S - Sim ou N - N�o ) ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        if (opcao == 'S') {
            pausar(musica);
        } else {
            tocar(musica);
        }
    }

    @Override
    public void pausar(String musica) {
        System.out.println("Musica " + musica + " est� pausada.");
    }

    @Override
    public String selecionarMusica() {

        String musicas[] = {"Glory of Love", "Take My Breath Away", "What A Feeling", "Mia Gioconda", "Unchained Melody", "(I've Had) The Time Of My Life"};
        System.out.println("Lista de m�sicas:");
        for (int i = 0; i < musicas.length; i++) {
            System.out.printf("%d - %s\n", i + 1, musicas[i]);
        }
        int opcaoDesejada;
        System.out.println();
        do{
            System.out.print("Digite o numero da op��o da musica desejada: ");
            opcaoDesejada = scanner.nextInt();
        }while (opcaoDesejada<=0 || opcaoDesejada>6);

        String musicaDesejada = null;
        for (int i = 0; i < musicas.length; i++) {
            if ((opcaoDesejada - 1) == i) {
                musicaDesejada = musicas[i];
            }
        }
        tocar(musicaDesejada);
        scanner.close();

        return musicaDesejada;
    }

    @Override
    public void exibirPagina(String nomeDaPagina) {
        System.out.println("Exibindo a pagina : " + nomeDaPagina);
        System.out.print("Deseja adicionar nova aba? ( S - Sim ou N - N�o ) ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        if (opcao == 'S') {
            adicionarNovaAba();
        } else {
            System.out.print("Voc� gostaria de atualizar a p�gina? ( S - Sim ou N - N�o ) ");
            char atualizarpagina = scanner.next().toUpperCase().charAt(0);
            if (atualizarpagina == 'S') {
                atualizarPagina(nomeDaPagina);
            } else {
                System.out.println("Saindo do navegador!");
            }
        }

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
        System.out.print("Deseja entrar em uma nova pagina? ( S - Sim ou N - N�o ) ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        if (opcao == 'S') {
            scanner.nextLine();
            System.out.println("Digite o nome da p�gina para navegar: ");
            String nomeDaPagina = scanner.nextLine();
            exibirPagina(nomeDaPagina);
        } else {
            System.out.println("Saindo do navegador!");
        }
    }

    @Override
    public void atualizarPagina(String nomeDaPagina) {
        System.out.println("Atualizando a p�gina!");

        exibirPagina(guardarNomePagina(nomeDaPagina));
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }

    private static String guardarNomePagina(String nomePagina) {
        return nomePagina;
    }
}
