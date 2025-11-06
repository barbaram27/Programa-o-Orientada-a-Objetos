import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setNome("Bárbara");
        assertEquals("Bárbara", usuario.getNome());
    }

    @Test
    public void testSetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setIdade(17);
        assertEquals(17, usuario.getIdade());
    }
}
