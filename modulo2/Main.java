import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Antoine de Saint-Exupéry", "Francês");
        Livro livro = new Livro("O Pequeno Príncipe", "Filosofia/Infantil", autor);
        Usuario usuario = new Usuario("Bárbara Mendes", 17);

        Date retirada = new Date();
        Date devolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(retirada, devolucao, livro, usuario);

        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
    }
}
