import java.util.List;

public class Estrategia4 implements EstrategiaMenu{
    
    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        for (Abrigo abrigo : abrigos) {
            abrigo.imprimirPerfilAbrigo();
        }
    }
}
