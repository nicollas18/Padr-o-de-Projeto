public class Usuario {
    private String nome;
    private String email;
    private String senha;

    /*------------------- BASICO ------------------------*/

    // Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome  = nome;
        this.email = email;
        this.senha = senha;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*---------------------------------------------------*/

    
}
