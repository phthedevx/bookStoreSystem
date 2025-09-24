import com.phthedev.bookStoreSystem.Model.Autor;
import com.phthedev.bookStoreSystem.Model.Livro;
import com.phthedev.bookStoreSystem.Repository.Biblioteca;

void main(){
    Scanner s = new Scanner(System.in);
    boolean continuar = true;

    Biblioteca b = new Biblioteca();

    do{
        System.out.println("MENU DA BIBLIOTECA");
        System.out.println("1. Listar todos os livros disponíveis");
        System.out.println("2. Emprestar um livro");
        System.out.println("0. Sair do sistema");
        System.out.println("Escolha uma opção: ");
        int opcao = s.nextInt();
        s.nextLine();

        switch (opcao){
            case 0:
                System.out.println("Saindo...");
                continuar = false;
                break;
            case 1:
                b.listarLivrosDisponiveis();
                break;
            case 2:
                System.out.print("Digite o id do livro que deseja fazer um emprestimo: ");
                String inputIdLivro = s.nextLine();
                try {
                    UUID idLivro = UUID.fromString(inputIdLivro);
                    b.emprestarLivro(idLivro);
                } catch (IllegalArgumentException e) {
                    System.out.println("ID inválido! Por favor, insira um ID no formato correto.");
                }
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    } while(continuar);
    s.close();
}