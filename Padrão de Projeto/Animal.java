public class Animal {
    private String nome;
    private int idade;
    private String raca;
    private String personalidade;


    /*------ 1:GERENCIAMENTO DE PERFIS DE ANIMAIS DE ESTIMAÇÃO---------*/

    // Construtor
    public Animal(String nome, int idade, String raca, String personalidade) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.personalidade = personalidade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    /*---------------------------------------------------*/

    @Override

    public String toString() {
        return "Nome: " + this.nome;
    }
}
