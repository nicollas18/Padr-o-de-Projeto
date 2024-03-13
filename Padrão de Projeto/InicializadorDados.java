import java.util.Arrays;
import java.util.List;

public class InicializadorDados {

    private static List<Abrigo> abrigos;
    private static Forum forum;
    
    public static void inicializadorBaseDados() {

        
        /*----------------------- BASE DE DADOS------------------------ */
        // USUARIOS:
        Usuario usuario1 = new Usuario("João", "joao@email.com", "senha123");
        Usuario usuario2 = new Usuario("Maria", "maria@email.com", "456senha");
        Usuario usuario3 = new Usuario("Carlos", "carlos@email.com", "789senha");
        Usuario usuario4 = new Usuario("Ana", "ana@email.com", "ana321senha");
        Usuario usuario5 = new Usuario("Pedro", "pedro@email.com", "1234pedrosenha");
        Usuario usuario6 = new Usuario("Sofia", "sofia@email.com", "567sofiasenha");
        Usuario usuario7 = new Usuario("Lucas", "lucas@email.com", "lucas789senha");
        Usuario usuario8 = new Usuario("Laura", "laura@email.com", "890senha");
        Usuario usuario9 = new Usuario("Gabriel", "gabriel@email.com", "gabrielsenha");
        Usuario usuario10 = new Usuario("Clara", "clara@email.com", "4321clarasenha");
        Usuario usuario11 = new Usuario("Gabriela", "gabriela@email.com", "789senha");
        Usuario usuario12 = new Usuario("Renato", "renato@email.com", "renato123senha");
        Usuario usuario13 = new Usuario("Beatriz", "beatriz@email.com", "456beatrizsenha");
        Usuario usuario14 = new Usuario("Ricardo", "ricardo@email.com", "ricardo987senha");
        Usuario usuario15 = new Usuario("Amanda", "amanda@email.com", "amanda321senha");

        // ANIMAIS:
        Animal animal1 = new Animal("Bolinha", 2, "Vira-lata", "Brincalh�o");
        Animal animal2 = new Animal("Frajola", 3, "Siam�s", "Calmo");
        Animal animal3 = new Animal("Rex", 5, "Labrador", "Amig�vel");
        Animal animal4 = new Animal("Luna", 1, "Persa", "Independente");
        Animal animal5 = new Animal("Thor", 4, "Golden Retriever", "Ativo");
        Animal animal6 = new Animal("Mia", 6, "Poodle", "Inteligente");
        Animal animal7 = new Animal("Simba", 2, "Bengal", "Curioso");
        Animal animal8 = new Animal("Nina", 3, "Boxer", "Energ�tico");
        Animal animal9 = new Animal("Bob", 2, "Bulldog Franc�s", "Afetuoso");
        Animal animal10 = new Animal("Tobby", 4, "D�lmata", "Protetor");
        Animal animal11 = new Animal("Pel�cia", 2, "Chow Chow", "Alegre");
        Animal animal12 = new Animal("Marley", 4, "Pastor Alem�o", "Protetor");
        Animal animal13 = new Animal("Luna", 3, "Shih Tzu", "Carinhosa");
        Animal animal14 = new Animal("Boris", 5, "Rottweiler", "Leal");
        Animal animal15 = new Animal("Miau", 1, "Gato Persa", "Curioso");

        // ABRIGOS:

        Abrigo abrigo1 = new Abrigo("Abrigo Amigos dos Animais", "Rua das Flores, 123", "abrigoamigo@email.com", "(11) 1234-5678", " Segunda a S�bado, das 10h �s 17h");

        Abrigo abrigo2 = new Abrigo("Abrigo Patinhas Felizes", "Avenida dos Anjos, 456", "patinhasfelizes@email.com", "(22) 9876-5432", "Segunda a S�bado, das 10h �s 17h");

        Abrigo abrigo3 = new Abrigo("Lar dos Peludos", "Endere�o: Travessa das Ruas, 789", "lardospeludos@email.com", "(33) 8765-4321", " Segunda a Domingo, das 8h �s 20h");

        //EVENTOS:

        Evento eventoAbrigo1_1 = new Evento("Campanha de Ado��o de Inverno",
        "Campanha especial para ado��o de animais durante o inverno. Descontos especiais e kits de boas-vindas para os novos donos",
        "15 de julho de 2024", "Campanha de Ado��o");

        Evento eventoAbrigo1_2 = new Evento("Arrecada��o de Fundos",
        "Evento para arrecadar fundos para a constru��o de novos canis. Rifa e bazares beneficentes ser�o realizados.",
        "30 de setembro de 2024", "Arrecada��o de Fundos");

        
        Evento eventoAbrigo2_1 = new Evento("Feira de Ado��o",
        "Feira com diversos animais dispon�veis para ado��o. Palestras e atividades para crian�as.",
        "5 de agosto de 2024", "Feira de Ado��o");

        Evento eventoAbrigo2_2 = new Evento("Campanha de Vacina��o",
        "Vacina��o gratuita para c�es e gatos. Todos s�o bem-vindos!",
        "20 de outubro de 2024", "Campanha de Sa�de");

        Evento eventoAbrigo3_1 = new Evento("Caminhada Solid�ria",
        "Caminhada com os animais dispon�veis para ado��o. Todos est�o convidados a participar!",
        "12 de agosto de 2024", "Caminhada Beneficente");

        Evento eventoAbrigo3_2 = new Evento("Feira de Ado��o Especial",
        "Feira especial com atividades para fam�lias. Ado��o de animais e brindes para os novos donos.",
        "25 de outubro de 2024", "Feira de Ado��o Especial");

        // HISTÓRIAS

        String historia1 = "Polly encontrou um lar amoroso! Ela era tímida, mas com paciência e carinho, se tornou a alegria da família. Adotada em 10/02/2023.";
        String historia2 = "Rex, agora Apollo, é um companheiro fiel! Ele veio cheio de energia e se tornou o melhor amigo de todas as horas. Adotado em 25/06/2023.";
        String historia3 = "Luna, a doce gatinha, encontrou seu lar perfeito. Ela adora dormir na janela e brincar com seus novos amigos felinos. Adotada em 05/11/2023.";

        // FÓRUM:

        forum = new Forum();

        forum.criarTopico("Dicas para cuidar de animais");
        forum.criarTopico("Compartilhe sua hist�ria de ado��o");
        forum.criarTopico("Dicas de Treinamento");
        forum.criarTopico("Sa�de e Bem-Estar");
        forum.criarTopico("Comportamento Animal");

        // Tópico 1
        forum.adicionarMensagemNoTopico(0, "Carol", "Sempre ofere�a �gua fresca para seus pets!");
        forum.adicionarMensagemNoTopico(0, "Pedro", "� importante manter uma rotina de alimenta��o para os animais.");

        // Tópico 2
        forum.adicionarMensagemNoTopico(1, "Mariana", "Adotei um gato no abrigo e ele se tornou meu melhor amigo!");
        forum.adicionarMensagemNoTopico(1, "Rafael", "Minha hist�ria de ado��o mudou minha vida para sempre.");

        // Tópico 3
        forum.adicionarMensagemNoTopico(2, "Marcos", "Algu�m tem dicas para treinar um filhote?");
        forum.adicionarMensagemNoTopico(2, "Bruno", "Eu costumo usar refor�o positivo para treinar meu cachorro. Funciona muito bem!");

        // Tópico 4
        forum.adicionarMensagemNoTopico(3, "Luiza", "Como manter a sa�de do meu gato em dia?");
        forum.adicionarMensagemNoTopico(3, "Daniel", "Consultas regulares ao veterin�rio s�o essenciais para a sa�de dos pets.");

        forum.adicionarMensagemNoTopico(4, "Ithalo", "Meu cachorro est� agindo de maneira estranha, algu�m j� passou por isso?");
        forum.adicionarMensagemNoTopico(4, "Leticia", "Pode ser estresse. Tente entender se algo mudou na rotina dele.");

        // INICIANDO ABRIGOS:

        // Abrigo 1
        abrigo1.adicionarUsuario(usuario1);
        abrigo1.adicionarUsuario(usuario2);
        abrigo1.adicionarUsuario(usuario3);
        abrigo1.adicionarUsuario(usuario4);
        abrigo1.adicionarUsuario(usuario5);

        abrigo1.adicionarAnimal(animal1);
        abrigo1.adicionarAnimal(animal2);
        abrigo1.adicionarAnimal(animal3);
        abrigo1.adicionarAnimal(animal4);
        abrigo1.adicionarAnimal(animal5);

        abrigo1.adicionarEvento(eventoAbrigo1_1);
        abrigo1.adicionarEvento(eventoAbrigo1_2);

        abrigo1.adicionarHistoriaSucesso(historia1);
        

        // Abrigo 2
        
        abrigo2.adicionarUsuario(usuario6);
        abrigo2.adicionarUsuario(usuario7);
        abrigo2.adicionarUsuario(usuario8);
        abrigo2.adicionarUsuario(usuario9);
        abrigo2.adicionarUsuario(usuario10);
        
        abrigo2.adicionarAnimal(animal6);
        abrigo2.adicionarAnimal(animal7);
        abrigo2.adicionarAnimal(animal8);
        abrigo2.adicionarAnimal(animal9);
        abrigo2.adicionarAnimal(animal10);

        abrigo2.adicionarEvento(eventoAbrigo2_1);
        abrigo2.adicionarEvento(eventoAbrigo2_2);

        abrigo2.adicionarHistoriaSucesso(historia2);


        // Abrigo 3

        abrigo1.adicionarUsuario(usuario11);
        abrigo1.adicionarUsuario(usuario12);
        abrigo1.adicionarUsuario(usuario13);
        abrigo1.adicionarUsuario(usuario14);
        abrigo1.adicionarUsuario(usuario15);

    
        abrigo3.adicionarAnimal(animal11);
        abrigo3.adicionarAnimal(animal12);
        abrigo3.adicionarAnimal(animal13);
        abrigo3.adicionarAnimal(animal14);
        abrigo3.adicionarAnimal(animal15);

        abrigo3.adicionarEvento(eventoAbrigo3_1);
        abrigo3.adicionarEvento(eventoAbrigo3_2);

        abrigo3.adicionarHistoriaSucesso(historia3);

        abrigos = Arrays.asList(abrigo1, abrigo2, abrigo3);

    }

    public static List<Abrigo> getAbrigos() {
        return abrigos;
    }

    public static Forum getForum() {
        return forum;
    }
}
