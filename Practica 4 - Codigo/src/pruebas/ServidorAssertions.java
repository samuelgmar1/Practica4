package pruebas;

import modelos.Estado;
import modelos.Partida;
import modelos.Servidor;
import modelos.Usuario;
import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class ServidorAssertions {

    private static Usuario usuario;
    private static Usuario usuario2;
    private static Usuario[] jugadoresPartida;
    private static Partida[] partidas;
    private static Servidor servidor;
    private static Partida partida;

    @Test
    public void testMetServidor() {
        /*Usuario usuario = new Usuario("DAVID FERREIRO", Estado.CONECTADO.toString());
        Usuario usuario2 = new Usuario("JAVIER MARTINEZ", Estado.DESCONECTADO.toString());

        Usuario[] jugadoresPartida = {usuario, usuario2};

        Partida[] partidas = {};

        Servidor servidor = new Servidor(jugadoresPartida, partidas, usuario);
        Partida partida = new Partida("PARTIDA AMISTOSA", List.of(jugadoresPartida), 20, "PARCHIS", false, servidor);


         */

        assertArrayEquals(jugadoresPartida, servidor.getJugadores());
        assertSame("Usuario agregado con éxito.", servidor.agregarJugador(usuario));
        assertSame("Partida agregada con éxito.", servidor.agregarPartida(partida));
        assertSame("Partida borrada con éxito.", servidor.borrarPartida(partida.getNombre()));
        assertSame("Jugador borrado con éxito.", servidor.borrarJugador(usuario.getNombre()));
        assertSame(usuario, servidor.getAdmin());
        assertSame(partidas, servidor.getPartidas());
        assertSame(jugadoresPartida, servidor.getJugadores());
    }

    @Test
    public void testAsertos() {
        /*Usuario usuario = new Usuario("DAVID FERREIRO", Estado.CONECTADO.toString());
        Usuario usuario2 = new Usuario("JAVIER MARTINEZ", Estado.DESCONECTADO.toString());

        Usuario[] jugadoresPartida = {usuario, usuario2};

        Partida[] partidas = {};

        Servidor servidor = new Servidor(jugadoresPartida, partidas, usuario);
        Partida partida = new Partida("PARTIDA AMISTOSA", List.of(jugadoresPartida), 20, "PARCHIS", false, servidor);

         */
        assertEquals(usuario2.getNombre(), servidor.getAdmin().getNombre());
        assertTrue("Usuario agregado con éxito.".equals(servidor.agregarJugador(usuario)));
        assertFalse("Usuario agregado con éxito.", Boolean.parseBoolean(servidor.agregarJugador(usuario).toString()));
        assertNotNull(servidor.getAdmin());
        assertNull(servidor.getAdmin());
        assertSame(usuario, servidor.getAdmin());
        assertNotSame(usuario, servidor.getAdmin());
        assertArrayEquals(servidor.getJugadores(), jugadoresPartida);
    }

    @Before
    public void inicializar() {
        usuario = new Usuario("DAVID FERREIRO", Estado.CONECTADO.toString());
        usuario2 = new Usuario("JAVIER MARTINEZ", Estado.DESCONECTADO.toString());
        jugadoresPartida = new Usuario[]{usuario,usuario2};
        partidas = new Partida[]{};
        servidor = new Servidor(jugadoresPartida, partidas, usuario);
        partida = new Partida("PARTIDA AMISTOSA", List.of(jugadoresPartida), 20, "PARCHIS", false, servidor);
        System.out.println("Inicializacion correcta");
    }

    @After
    public void limpiar() {
        jugadoresPartida = null;
        partidas = null;
        System.out.println("Array eliminados");
    }

    @BeforeClass
    public static void comprobacion() {
        if (jugadoresPartida == null || jugadoresPartida.length == 0 || partidas == null || partidas.length == 0) {
            System.out.println("Arrays no inicializados");
        }
    }

    @AfterClass
    public static void comprobacionPosterior() {
        if (jugadoresPartida != null && jugadoresPartida.length > 2) {
            System.out.println("Pruebas correctas");
        }
    }

    @Ignore
    @Test
    public void ignorar() {
        assertTrue("Usuario agregado con éxito.".equals(servidor.agregarJugador(usuario)));
        System.out.println("Prueba ignorada: introducir usuario");
    }

}
