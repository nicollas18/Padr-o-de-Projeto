import java.util.List;
import java.util.Scanner;

public class Estrategia6 implements EstrategiaMenu {

    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("\nO que voce quer?");
            System.out.println("1 - Adicionar um Evento");
            System.out.println("2 - Lista dos Eventos");
            System.out.println("3 - Voltar para o Menu");

            int input = scan.nextInt(); 

            if (input == 3) {
                break;
            }

            switch (input) {

                case 1:
                    System.out.println("Digite o nome do Evento:");
                    scan.nextLine();
                    String nomeEvento = scan.nextLine();
                    System.out.println("Digite a descrição do Evento");
                    String descricao = scan.nextLine();
                    System.out.println("Digite a data do Evento"); 
                    String data = scan.nextLine();
                    System.out.println("Digite o tipo do Evento");
                    String tipo = scan.nextLine();
                    Evento novoEvento = new Evento(nomeEvento, descricao, data, tipo);
                    abrigoEscolhido.adicionarEvento(novoEvento);
                    break;

                case 2:
                    abrigoEscolhido.listarEventos();
                    break;

                case 3:
                    
            }
        }

        scan.close();

    }
    
}
