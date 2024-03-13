import java.util.List;
import java.util.Scanner;

public class Estrategia10 implements EstrategiaMenu {

    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println();
            forum.exivirTopicos();

            System.out.println("O que desejar fazer?");
            System.out.println("1 - Falar sobre um Tópico");
            System.out.println("2 - Adicionar um Tópico");
            System.out.println("3 - Ver Mensagens de um Tópico");
            System.out.println("4 - Voltar para o Menu");

            int input = scan.nextInt();

            if (input == 4) {
                break;
            }

            switch (input) {

                case 1:
                    System.out.println("Sobre qual tópico você gostaria de falar?");
                    int topico = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Informe seu nome");
                    String nome = scan.nextLine();
                    System.out.println("Digite sua mensagem");
                    String mensagem = scan.nextLine();
                    forum.adicionarMensagemNoTopico(topico - 1, nome, mensagem);
                    break;

                case 2:
                    System.out.println("Informe o titulo do tópico");
                    String titulo = scan.nextLine();

                    forum.criarTopico(titulo);
                    break;

                case 3:
                    System.out.println("Informe o tópico que desejar ver as mensagens");
                    topico = scan.nextInt();

                    forum.exibirMensagensDoTopico(topico - 1);
                    break; 
            }
        }

        scan.close();
    }   
}
