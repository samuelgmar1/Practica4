package modelos;

import java.util.List;

public class Servidor {
    private Usuario[] jugadores = {};
    private Partida[] partidas = {};
    private Usuario admin;

    private String estado = null;

    private int contadorJugadores;
    private int contadorPartidas;

    public Servidor( Usuario admin) {
        this.jugadores = new Usuario[10];
        this.partidas = new Partida[10];
        this.admin = admin;
        this.contadorPartidas = 0;
        this.contadorJugadores = 0;
    }

    public Servidor(Usuario[] jugadores, Partida[] partidas, Usuario admin) {
        this.jugadores = jugadores;
        this.partidas = partidas;
        this.admin = admin;
    }

    public String agregarJugador(Usuario nuevoJugador) {
        if (contadorJugadores < jugadores.length) {
            jugadores[contadorJugadores] = nuevoJugador;
            contadorJugadores++;
            return "Usuario agregado con éxito.";
        } else {
            return "No se puede agregar más jugadores. El límite ha sido alcanzado.";
        }
    }

    public String agregarPartida(Partida nuevaPartida) {
        if (contadorPartidas < partidas.length) {
            partidas[contadorPartidas] = nuevaPartida;
            contadorPartidas++;
            return "Partida agregada con éxito.";
        } else {
            return "No se puede agregar más partidas. El límite ha sido alcanzado.";
        }
    }

    public String borrarJugador(String nombreJugador) {
        for (int i = 0; i < contadorJugadores; i++) {
            if (jugadores[i] != null && jugadores[i].getNombre().equals(nombreJugador)) {
                // Desplaza los elementos a la izquierda para "borrar" el jugador en la posición indicada
                for (int j = i; j < contadorJugadores - 1; j++) {
                    jugadores[j] = jugadores[j + 1];
                }
                // Coloca null en la última posición para indicar que está vacía
                jugadores[contadorJugadores - 1] = null;
                contadorJugadores--;
                return "Jugador borrado con éxito.";
            }
        }
        return null;
    }

    public String borrarPartida(String nombrePartida) {
        for (int i = 0; i < contadorPartidas; i++) {
            if (partidas[i] != null && partidas[i].getNombre().equals(nombrePartida)) {
                // Desplaza los elementos a la izquierda para "borrar" el jugador en la posición indicada
                for (int j = i; j < contadorPartidas - 1; j++) {
                    partidas[j] = partidas[j + 1];
                }
                // Coloca null en la última posición para indicar que está vacía
                partidas[contadorPartidas - 1] = null;
                contadorPartidas--;
                return "Partida borrada con éxito.";
            }
        }
        return null;
    }

    public Partida[] getPartidas() {
        return partidas;
    }


    public Usuario getAdmin() {
        return admin;
    }

    public void setAdmin(Usuario admin) {
        this.admin = admin;
    }

    public Usuario[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Usuario[] jugadores) {
        this.jugadores = jugadores;
    }

    public void setPartidas(Partida[] partidas) {
        this.partidas = partidas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
