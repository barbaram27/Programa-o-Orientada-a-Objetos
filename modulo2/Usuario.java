import java.util.ArrayList;

public class Usuario extends Pessoa {
    private int idade;
    private ArrayList<Emprestimo> historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
        this.historicoEmprestimos = new ArrayList<>();
    }

    public int getIdade() {
        return idade;
    }

    public void adicionarEmprestimo(Emprestimo e) {
        historicoEmprestimos.add(e);
    }

    public ArrayList<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}
