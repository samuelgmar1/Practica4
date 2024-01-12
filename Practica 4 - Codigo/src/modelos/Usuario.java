package modelos;

public class Usuario {
    private String nombre;
    private Estado estado;

    public Usuario(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = Estado.DESCONECTADO;
    }

    public Estado usuarioJugando(){
        this.estado = Estado.JUGANDO;
        return estado;
    }

    public Estado usuarioConectado(){
        this.estado = Estado.CONECTADO;
        return estado;
    }

    public Estado usuarioDesconectado(){
        this.estado = Estado.DESCONECTADO;
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
