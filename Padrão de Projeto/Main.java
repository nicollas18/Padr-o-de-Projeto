import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        InicializadorDados.inicializadorBaseDados();

        List<Abrigo> abrigos = InicializadorDados.getAbrigos();
        Forum forum = InicializadorDados.getForum();

        Map<Integer, EstrategiaMenu> estrategias = new HashMap<>();
        estrategias.put(1, new Estrategia1());
        estrategias.put(2, new Estrategia2());
        estrategias.put(3, new Estrategia3());
        estrategias.put(4, new Estrategia4());
        estrategias.put(5, new Estrategia5());
        estrategias.put(6, new Estrategia6());
        estrategias.put(7, new Estrategia7());
        estrategias.put(8, new Estrategia8());
        estrategias.put(9, new Estrategia9());
        estrategias.put(10, new Estrategia10());

        while(true){

            System.out.println();
            System.out.println("Escolha um abrigo");
            
            int i = 1;

            for (Abrigo abrigo : abrigos) {
                System.out.println(i + " - " + abrigo.getNomeAbrigo());
                i++;
            }
    
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            Abrigo abrigoEscolhido = null;


            switch (input) {

                case 1: 
                case 2:
                case 3:
                    abrigoEscolhido = abrigos.get(input - 1);
                    break;

                default:
                    System.out.println("\nOpcao Invalida.");
                    continue;
            }

            while (true) {

                new opcoes().exibirOpcoes();

                int estrategiaEscolhida = scan.nextInt();

                if (estrategiaEscolhida == 0) {
                    scan.close();
                    return;
                }

                if (estrategiaEscolhida == 11) {
                    break;
                }

                try {

                    EstrategiaMenu estrategiaMenu = estrategias.get(estrategiaEscolhida);

                    if (estrategiaMenu != null) {
                        estrategiaMenu.executar(abrigoEscolhido, abrigos, forum);

                    } else{
                        throw new IllegalArgumentException("Estrategia nao encontrada.");
                    } 

                } catch (Exception e) {
                    System.out.println("Ocorreu um erro: " + e.getMessage());
                }
            } 

            scan.close();
        } 
    }
}