package fachada;

import entidades.Grupo;
import java.awt.Color;
import entidades.Jugador;

/**
 *
 * @author galan
 */
public class PerfilFachada {

    private Jugador jugador;

    // Constructor que recibe al jugador que se va a modificar
    public PerfilFachada(Jugador jugador) {
        this.jugador = jugador;
    }

    public void cambiarFoto(String nuevaFoto) {
        jugador.setAvatar(nuevaFoto);
        System.out.println("Foto cambiada con éxito.");
    }

    public void cambiarNombre(String nuevoNombre) {
        jugador.setNombre(nuevoNombre);
        System.out.println("Nombre cambiado con éxito.");
    }

    public Grupo cambiarColoresFichas(int numeroGrupo, Color nuevoColor) {
        jugador.cambiarColorGrupo(numeroGrupo, nuevoColor);
        Grupo grupoActualizado = new Grupo();
        grupoActualizado.setColor(nuevoColor);
        grupoActualizado.setNumeroGrupo(numeroGrupo);
        return grupoActualizado;
    }

    public Jugador verificarSeleccionNombre(String dato) {
        if (dato == null || dato.isEmpty() || dato.isBlank()) {
            System.out.println("El nombre esta vacio!");
            return null;
        } else {
            cambiarNombre(dato);
            System.out.println("El nombre del jugador se guardo con exito :)");
            System.out.println(jugador.getNombre());
            return jugador;
        }
    }

    public Jugador verificarSeleccionAvatar(String dato) {
        if (dato == null || dato.isEmpty() || dato.isBlank()) {
            System.out.println("No se selecciono una imagen");
            return null;
        } else {
            cambiarFoto(dato);
            System.out.println(jugador.getAvatar() + " Es mi avatar");
            return jugador;
        }
    }
}
