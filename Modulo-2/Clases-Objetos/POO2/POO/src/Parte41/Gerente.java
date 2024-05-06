package Parte41;

import java.util.ArrayList;
import java.util.List;

// Subclase Gerente
public class Gerente extends Empleado1 {

    public List<String> equipo;

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
        equipo = new ArrayList<>();
    }

    // Método para agregar miembros al equipo
    public void agregarMiembro(String nombre) {
        equipo.add(nombre);
    }
}
