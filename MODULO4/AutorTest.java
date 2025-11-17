import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testIsUsuario() {
        Autor autor = new Autor("Jess", "Brasileira", true);
        assertTrue(autor.isUsuario());
    }

    @Test
    public void testIsAutorTradicional() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        assertFalse(autor.isUsuario());
    }

    @Test
    public void testSetUsuario() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        autor.setUsuario(true);
        assertTrue(autor.isUsuario());
    }
}
