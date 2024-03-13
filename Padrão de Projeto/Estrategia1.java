import java.util.List;
import java.util.Scanner;

public class Estrategia1 implements EstrategiaMenu {
    
    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {
        
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Informe a Operação Desejada");
            System.out.println("1 - Listar Animais Disponíveis");
            System.out.println("2 - Adicionar Novo Animal");
            System.out.println("3 - Retornar ao Menu");
            System.out.printf("\n");
            int opcaoAnimal = scan.nextInt();  

            if (opcaoAnimal == 3) {
                break;
            }

            switch (opcaoAnimal) {

                case 1:
                    abrigoEscolhido.imprimirAnimaisDisponiveis();
                    break;

                case 2:
                    System.out.println("Digite o nome do animal:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String nomeAnimal = scan.nextLine();
                    System.out.println("Digite a idade do animal:");
                    int idadeAnimal = scan.nextInt();
                    System.out.println("Digite a ra�a do animal:");
                    scan.nextLine(); // Limpar o buffer do scanner
                    String racaAnimal = scan.nextLine();
                    System.out.println("Digite a personalidade do animal:");
                    String personalidadeAnimal = scan.nextLine();
                    
                    Animal novoAnimal = new Animal(nomeAnimal, idadeAnimal, racaAnimal, personalidadeAnimal);
                    abrigoEscolhido.adicionarAnimal(novoAnimal);
                    System.out.println("Novo animal adicionado com sucesso!");
                    break;
            
                default:
                    System.out.println("Opcao Invalida.");
                    break;
            }
        } 
        
        scan.close();
    } 
}
