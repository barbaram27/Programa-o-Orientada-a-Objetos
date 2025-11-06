import java.util.ArrayList;

public class Autor extends Pessoa {
    private String nacionalidade;
    private ArrayList<Livro> obrasPublicadas;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public ArrayList<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public ArrayList<Livro> getObrasPorGenero(String genero) {
        ArrayList<Livro> filtrados = new ArrayList<>();
        for (Livro l : obrasPublicadas) {
            if (l.getGenero().equalsIgnoreCase(genero)) {
                filtrados.add(l);
            }
        }
        return filtrados;
    }
}
