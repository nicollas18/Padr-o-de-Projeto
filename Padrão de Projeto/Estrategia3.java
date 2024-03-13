import java.util.List;
import java.util.Scanner;

public class Estrategia3 implements EstrategiaMenu {
    
    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Escolha uma opção de pesquisa:");
            System.out.println("1 - Pesquisar por Ra�a");
            System.out.println("2 - Pesquisar por Idade");
            System.out.println("3 - Pesquisar por Personalidade");
            System.out.println("4 - Voltar para o Menu");
            System.out.printf("\n");
            
            int opcaoPesquisa = scan.nextInt();  

            if (opcaoPesquisa == 4) {
                break;
            }

            switch (opcaoPesquisa) {

                case 1:
                    // Pesquisar por ra�a
                    System.out.println("Digite a raça para pesquisa:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String racaPesquisa = scan.nextLine();

                    
                    
                    List<Animal> animaisPorRaca = abrigoEscolhido.buscarAnimaisPorCriterio("raca", racaPesquisa);

                    if (!animaisPorRaca.isEmpty()) {
                        System.out.println("Animais encontrados com a raça '" + racaPesquisa + "':");
                        for (Animal animal : animaisPorRaca) {
                            System.out.println(animal);
                        }
                    } else {
                        System.out.println("Nenhum animal encontrado com a raça '" + racaPesquisa + "'.");
                    }
                    break;

                case 2:
                    // Pesquisar por idade
                    System.out.println("Digite a idade para pesquisa:");
                    int idadePesquisa = scan.nextInt();
                    
                    List<Animal> animaisPorIdade = abrigoEscolhido.buscarAnimaisPorCriterio("idade", String.valueOf(idadePesquisa));
                    if (!animaisPorIdade.isEmpty()) {
                        System.out.println("Animais encontrados com a idade '" + idadePesquisa + "':");
                        for (Animal animal : animaisPorIdade) {
                            System.out.println(animal);
                        }
                    } else {
                        System.out.println("Nenhum animal encontrado com a idade '" + idadePesquisa + "'.");
                    }
                    break;

                case 3:
                    // Pesquisar por personalidade
                    System.out.println("Digite a personalidade para pesquisa:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String personalidadePesquisa = scan.nextLine();
                    
                    List<Animal> animaisPorPersonalidade = abrigoEscolhido.buscarAnimaisPorCriterio("personalidade", personalidadePesquisa);
                    if (!animaisPorPersonalidade.isEmpty()) {
                        System.out.println("Animais encontrados com a personalidade '" + personalidadePesquisa + "':");
                        for (Animal animal : animaisPorPersonalidade) {
                            System.out.println(animal);
                        }
                    } else {
                        System.out.println("Nenhum animal encontrado com a personalidade '" + personalidadePesquisa + "'.");
                    }
                    break;

                default:
                    System.out.println("Opcao Invalida.");
                    break;
            }
        }

        scan.close();
    }
}
