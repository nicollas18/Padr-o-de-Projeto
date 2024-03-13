import java.util.ArrayList;
import java.util.List;

public class Forum {
    
    private List<Topico> topicos;

    public Forum() {
        this.topicos = new ArrayList<>();
    }

    public void criarTopico(String titulo) {
        topicos.add(new Topico(titulo));
    }

    public void exivirTopicos() {
        for (int i = 0; i < topicos.size(); i ++) {
            System.out.println("Topico #" + (i+1) + ": " + topicos.get(i).getTitulo());
            
        }
        System.out.println();
    }

    public void adicionarMensagemNoTopico(int indiceTopico, String autor, String conteudo) {
        if (indiceTopico >= 0 && indiceTopico < topicos.size()) {
            topicos.get(indiceTopico).adcionarMensagem(autor, conteudo);
        } else {
            System.out.println("Tópico não encontrado.");
        }
    }

    public void exibirMensagensDoTopico(int indiceTopico) {
        if (indiceTopico >= 0 && indiceTopico < topicos.size()) {
            topicos.get(indiceTopico).listarMensagens();
        } else {
            System.out.println("Tópico não encontrado.");
        }
    }
}
