package modelos;

import java.util.List;

public class Partida {
    private String nombre;
    private Servidor servidor;
    private int jugadores;
    private List<Usuario> jugadoresPartida;
    private double tiempoPartida;
    private String juego;
    private Boolean finalizada;

    public Partida(String nombre, List<Usuario> jugadoresPartida, double tiempoPartida, String juego, Boolean finalizada, Servidor servidor) {
        this.nombre = nombre;
        this.jugadoresPartida = jugadoresPartida;
        this.tiempoPartida = tiempoPartida;
        this.juego = juego;
        this.finalizada = finalizada;
        this.jugadores = jugadoresPartida.size();
        this.servidor = servidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public double getTiempoPartida() {
        return tiempoPartida;
    }

    public void setTiempoPartida(float tiempoPartida) {
        this.tiempoPartida = tiempoPartida;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }

    public List<Usuario> getJugadoresPartida() {
        return jugadoresPartida;
    }

    public void setJugadoresPartida(List<Usuario> jugadoresPartida) {
        this.jugadoresPartida = jugadoresPartida;
    }

    public void setTiempoPartida(double tiempoPartida) {
        this.tiempoPartida = tiempoPartida;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }
}
