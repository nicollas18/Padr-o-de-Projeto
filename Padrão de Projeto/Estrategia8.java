import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Estrategia8 implements EstrategiaMenu {

    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor que deseja doar");
        double valor;

        scan.useLocale(Locale.US); // Aceita ""."" na entrada. Exemplo: 150.20

        valor = scan.nextDouble();

        abrigoEscolhido.receberDoacao(valor);
        //System.out.println(abrigoEscolhido.getDoacoes());  

        scan.close();
    }  
}
