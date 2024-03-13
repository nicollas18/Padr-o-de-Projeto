import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Abrigo {

    private String nomeAbrigo;
    private String localizacao;
    private String contato;
    private String telefone;
    private String horario;
    private List<Animal> animaisDisponiveis;
    private List<Usuario> usuariosRelacionados;
    private List<Evento> eventos;
    private double totalDoacoes;
    private List<String> historiasSucesso;

    /*------------------- BASICO ------------------------*/
    
    // Construtor
    public Abrigo(String nomeAbrigo, String localizacao, String contato, String telefone, String horario) {
        this.nomeAbrigo = nomeAbrigo;
        this.localizacao = localizacao; 
        this.contato = contato;
        this.telefone = telefone;
        this.horario = horario; /* ------------ */
        this.animaisDisponiveis = new ArrayList<>();
        this.usuariosRelacionados = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.totalDoacoes = 0.0;
        this.historiasSucesso = new ArrayList<>();
        
    }

    // Métodos getters
    public String getNomeAbrigo() {
        return nomeAbrigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getContato() {
        return contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getHorario() {
        return horario;
    }

    public List<Animal> getAnimaisDisponiveis() {
        return animaisDisponiveis;
    }

    public List<Usuario> getUsuariosRelacionados() {
        return this.usuariosRelacionados;
    } 

    public double getDoacoes() {
        return this.totalDoacoes;
    }

    public void listarHistoriasSucesso() {
        if (historiasSucesso.isEmpty()) {
            System.out.println("Nenhuma historia de sucesso disponivel no momento");
        } else {
            System.out.println("Histórias de sucesso e depoimentos");
            for (String historia : historiasSucesso) {
                System.out.println("\n- " + historia + "\n");
            }
        }
    }

    // Métodos setters

    public void setNomeAbrigo(String nomeAbrigo) {
        this.nomeAbrigo = nomeAbrigo;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setHorario(String Horario) {
        this.horario = horario;
    }

    public void adicionarAnimal(Animal animal) {
        animaisDisponiveis.add(animal);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuariosRelacionados.add(usuario);
    }

    public void receberDoacao(double valor) {
        totalDoacoes += valor;
        System.out.println("Doação recebida com sucesso! Obrigado pela contribuição.");
    }

    public void adicionarHistoriaSucesso(String historia) {
        historiasSucesso.add(historia);

    }

    /*---------------------------------------------------*/

    


    /* ----- 2:PROCESSAMENTO DE PEDIDOS DE ADOÇÃO ------ */  

    // Método para imprimir animais disponíveis
    public void imprimirAnimaisDisponiveis() {
        int i = 1;
        System.out.println("Animais Disponiveis no " + nomeAbrigo + ":\n");
        for (Animal animal : animaisDisponiveis) {
            System.out.printf(i + " - Nome: %-10s | Idade: %-3d | Raca: %-20s | Personalidade: %-15s\n",
                    animal.getNome(), animal.getIdade(), animal.getRaca(), animal.getPersonalidade());
                    i++;
        }
        System.out.printf("\n");
    }

    // Método para processar solicitação de adoção
    public boolean solicitarAdocao(Usuario usuario, Animal animal) {
        if (animaisDisponiveis.contains(animal)) {
            // Processamento da solicitação (pode incluir notificações, confirmações, etc.)
            animaisDisponiveis.remove(animal);
            System.out.println("O usuario " + usuario.getNome() + " solicitou adocao de " + animal.getNome());
            return true; // Adoção aprovada
        } else {
            System.out.println("Este animal não está disponível para adoção no momento.");
            return false; // Adoção não aprovada
        }
    }

    /*---------------------------------------------------*/



    /* --------- 3:OPÇÕES DE PESQUISA E FILTRO --------- */ 

    // Método para realizar pesquisa de animais por critérios
    public List<Animal> buscarAnimaisPorCriterio(String criterio, String valor) {
        List<Animal> animaisEncontrados = new ArrayList<>();
        switch (criterio) {
            case "raca":
                animaisEncontrados = animaisDisponiveis.stream().filter(animal -> animal.getRaca().equalsIgnoreCase(valor)).collect(Collectors.toList());

                break;
            case "idade":
                int idade = Integer.parseInt(valor);
                animaisEncontrados = animaisDisponiveis.stream().filter(animal -> animal.getIdade() == idade).collect(Collectors.toList());
                break;
            case "personalidade":
                animaisEncontrados = animaisDisponiveis.stream().filter(animal -> animal.getPersonalidade().equalsIgnoreCase(valor)).collect(Collectors.toList());
                break;
            // Outros critérios podem ser adicionados conforme necessário
            default:
                System.out.println("Criterio de busca invalido.");
        }
        return animaisEncontrados;
    }

    /*---------------------------------------------------*/

    public void imprimirPerfilAbrigo() {
        System.out.println();
        System.out.println("Nome do Abrigo: " + this.nomeAbrigo);
        System.out.println("Endereco: " + this.localizacao);
        System.out.println("Contato: " + this.contato);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Horario: " + this.horario);
        System.out.println();
    }  

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void listarEventos() {
        System.out.println("Eventos do Abrigo: " + this.nomeAbrigo);
        for (Evento evento : eventos) {
            System.out.println("Nome: " + evento.getNome());
            System.out.println("Descrição: " + evento.getDescricao());
            System.out.println("Data: " + evento.getData());
            System.out.println("Tipo: " + evento.getTipo());
            System.out.println("--------------------");
        }
    }

    public void atualizarContaUsuario(Usuario usuarioExistente, Usuario novosDadosUsuario) {
        int index = usuariosRelacionados.indexOf(usuarioExistente);
        if (index != -1) {
            usuariosRelacionados.set(index, novosDadosUsuario);
            System.out.println("Conta de usuário atualizada com sucesso!");
        } else {
            System.out.println("Usuário não encontrado para atualização.");
        }
    }

    public void excluirContaUsuario(Usuario usuarioParaExcluir) {
        boolean removido = usuariosRelacionados.remove(usuarioParaExcluir);
        if (removido) {
            System.out.println("Conta de usuário excluída com sucesso!");
        } else {
            System.out.println("Usuário não encontrado para exclusão.");
        }
    }
}

