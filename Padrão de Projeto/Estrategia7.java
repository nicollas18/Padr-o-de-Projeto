import java.util.List;
import java.util.Scanner;

public class Estrategia7 implements EstrategiaMenu{
    
    @Override
    public void executar(Abrigo abrigoEscolhido, List<Abrigo> abrigos, Forum forum) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("\nO que voce quer fazer?");
            System.out.println("1 - Criar uma Conta");
            System.out.println("2 - Atualizar os Dados");
            System.out.println("3 - Excluir a Conta");
            System.out.println("4 - Voltar para o Menu");
    
            int input = scan.nextInt();

            if (input == 4) {
                return;
            }

            switch (input) {

                case 1:
                    System.out.println("Digite seu nome:");
                    scan.nextLine();
                    String nomeUsuario = scan.nextLine();
                    System.out.println("Digite o email");
                    String emailUsuario = scan.nextLine();
                    System.out.println("Digite a senha");
                    String senhaUsuario = scan.nextLine();

                    Usuario novoUsuario = new Usuario(nomeUsuario, emailUsuario, senhaUsuario);

                    abrigoEscolhido.adicionarUsuario(novoUsuario);
                    System.out.println("Usuário adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite os dados atuais:");
                    System.out.println("Digite seu nome:");
                    scan.nextLine();
                    String Nome = scan.nextLine();
                    System.out.println("Digite o email");
                    String Email = scan.nextLine();
                    System.out.println("Digite a senha");
                    String Senha = scan.nextLine();

                    System.out.println("\nDigite os novos dados:");
                    System.out.println("Digite seu nome:");
                    String novoNome = scan.nextLine();
                    System.out.println("Digite o email");
                    String novoEmail = scan.nextLine();
                    System.out.println("Digite a senha");
                    String novaSenha = scan.nextLine();

                    Usuario usuarioDesatualizado = new Usuario(Nome, Email, Senha);
                    Usuario usuarioAtualizado = new Usuario(novoNome, novoEmail, novaSenha);

                    abrigoEscolhido.atualizarContaUsuario(usuarioDesatualizado, usuarioAtualizado);
                    break;

                case 3:
                    System.out.println("Digite os seus dados");
                    System.out.println("Digite seu nome:");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    System.out.println("Digite o email");
                    String email = scan.nextLine();
                    System.out.println("Digite a senha");
                    String senha = scan.nextLine();

                    Usuario usuarioDelete = new Usuario(nome, email, senha);

                    abrigoEscolhido.excluirContaUsuario(usuarioDelete);
                    break; 

                default:
                    System.out.println("Opcao Invalida.");
                    break;
            }

            scan.close();
        }
        
    }
    
}
