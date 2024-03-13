public class Evento {
    private String nome;
    private String descricao;
    private String data;
    private String tipo;

    public Evento(String nome, String descricao, String data, String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.tipo = tipo;
    }

    // Métodos getters

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    // Métodos setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Descrição: " + descricao + ", Data: " + data + ", Tipo: " + tipo;
    }
         
}
