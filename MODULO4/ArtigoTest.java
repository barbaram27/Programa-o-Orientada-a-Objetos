import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testGetters() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("Alan Turing", artigo.getAutor().getNome());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testSetPublicado() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        artigo.setPublicado(false);

        assertFalse(artigo.isPublicado());
    }
}
