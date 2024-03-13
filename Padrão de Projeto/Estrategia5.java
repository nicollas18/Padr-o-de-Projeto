import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Estrategia5 implements EstrategiaMenu {

    private static void imprimirRecursoEducacional(String caminhoDoArquivo) {
        File arquivo = new File(caminhoDoArquivo);

        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Erro ao configurar a codificação UTF-8: " + e.getMessage());
        }
    }
    
    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Recursos Educacionais Disponíveis:");
        System.out.println("1 - Cuidados Básicos com Animais de Estimação");
        System.out.println("2 - Guia de Adoção Responsável");
        System.out.println("3 - Comportamento Animal");
        System.out.println();
        System.out.println("Sobre qual você deseja ler?");

        int opcao = scan.nextInt();
        String caminhoDoArquivo = "";

        switch (opcao) {

            case 1:
               caminhoDoArquivo = "Recursos/1 - Cuidados Basicos.txt";
               break;
            
            case 2:
                caminhoDoArquivo = "Recursos/2 - Guia de Adocao Responsavel.txt";
                break;

            case 3:
                caminhoDoArquivo = "Recursos/3 - Comportamento Animal.txt";
                break;

            default:
                System.out.println("Opcao Invalida");
                break;
        }

        imprimirRecursoEducacional(caminhoDoArquivo);
    }
}
