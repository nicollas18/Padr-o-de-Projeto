public class Mensagem {
    
    private String autor;
    private String conteudo;

    public Mensagem(String autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    // Métodos getters

    public String getAutor() {
        return this.autor;
    }

    public String getConteudo() {
        return this.conteudo;
    }
}
