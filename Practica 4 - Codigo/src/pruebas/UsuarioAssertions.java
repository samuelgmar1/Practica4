package pruebas;

import modelos.Estado;
import modelos.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;


public class UsuarioAssertions {

    private Usuario usuario;

    @Test
    public void testEstado(){
        usuario = new Usuario("USUARIO1", Estado.JUGANDO.toString());

        String estadoActual = usuario.getEstado().toString();

        usuario.usuarioDesconectado();

        if(!usuario.getEstado().toString().equals(estadoActual)){
            estadoActual = usuario.getEstado().toString();
            System.out.println("Metodo de estado: el estado ha cambiado a: " + estadoActual);
        }

        usuario.usuarioConectado();

        if(!usuario.getEstado().toString().equals(estadoActual)){
            estadoActual = usuario.getEstado().toString();
            System.out.println("Metodo de estado: el estado ha cambiado a: " + estadoActual);
        }

        usuario.usuarioJugando();

        if(!usuario.getEstado().toString().equals(estadoActual)){
            estadoActual = usuario.getEstado().toString();
            System.out.println("Metodo de estado: el estado ha cambiado a: " + estadoActual);
        }

        usuario.setNombre("USUARIO3");

        if(!usuario.getEstado().toString().equals(estadoActual)){
            estadoActual = usuario.getEstado().toString();
            System.out.println("Metodo de estado: el estado ha cambiado a: " + estadoActual);
        } else {
            System.out.println("El estado no ha cambiado");
        }
    }

    @Test
    public void TestEstadoUsuario() {
        Usuario usuario = new Usuario("USUARIO1", Estado.JUGANDO.toString());

        assertSame(Estado.DESCONECTADO, usuario.usuarioDesconectado());
        assertSame(usuario.usuarioConectado(), Estado.CONECTADO);
        assertSame(usuario.usuarioJugando(), Estado.JUGANDO);
        assertNotSame(usuario.setNombre("USUARIO3"), Estado.JUGANDO);
    }

}
