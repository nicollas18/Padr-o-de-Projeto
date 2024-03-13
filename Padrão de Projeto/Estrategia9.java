import java.util.List;
import java.util.Scanner;

public class Estrategia9 implements EstrategiaMenu {
    
    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("O que desejar fazer");
            System.out.println("1 - Adicionar um História");
            System.out.println("2 - Ver as Histórias");
            System.out.println(("3 - Voltar para o Menu"));

            int input = scan.nextInt();

            if (input == 3) {
                break;
            }

            switch (input) {

                case 1:
                    System.out.println("Conte sua história");
                    scan.nextLine();
                    String historia = scan.nextLine();

                    abrigoEscolhido.adicionarHistoriaSucesso(historia);
                    break;

                case 2:
                    abrigoEscolhido.listarHistoriasSucesso();
                    break;
            }
        }
    }
}
