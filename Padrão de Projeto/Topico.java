import java.util.ArrayList;
import java.util.List;

public class Topico {
    
    private String titulo;
    private List<Mensagem> mensagens;

    public Topico(String titulo) {
        this.titulo = titulo;
        this.mensagens = new ArrayList<>();
    }

    // Método get
    public String getTitulo() {
        return titulo;
    }

    // Método set
    public void adcionarMensagem(String autor, String conteudo) {
        mensagens.add(new Mensagem(autor, conteudo));
    }

    // Exibir as mensagens
    public void listarMensagens() {
        for (Mensagem mensagem : mensagens) {
            System.out.println();
            System.out.println("Autor: " + mensagem.getAutor());
            System.out.println("Conteúdo: " + mensagem.getConteudo());
            System.out.println();
        }
    }

    
}
