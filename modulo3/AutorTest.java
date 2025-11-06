import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Jess", autor.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor("Jess", "Brasileira");
        autor.setNome("Maria");
        assertEquals("Maria", autor.getNome());
    }

    @Test
    public void testSetNacionalidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        autor.setNacionalidade("Portuguesa");
        assertEquals("Portuguesa", autor.getNacionalidade());
    }
}
