package datos.clinicadatos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class gestorenfermeras{
    private ArrayList<enfermeras> enfermeras;
	
    public gestorenfermeras() {
        enfermeras = new ArrayList<enfermeras>();
    }
    public boolean nuevoenfermera() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo enfermera", JOptionPane.QUESTION_MESSAGE);
	String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo enfermera", JOptionPane.QUESTION_MESSAGE);
	String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo enfermera", JOptionPane.QUESTION_MESSAGE);
	String areadetrabajo = JOptionPane.showInputDialog(null, "Area de trabajo:", "Nuevo c", JOptionPane.QUESTION_MESSAGE);

	enfermeras nuevoEnfermera = new enfermeras(id, nombre, apellidos, areadetrabajo);
            return enfermeras.add(nuevoEnfermera);
	}

    public void mostrarenfermeras() {
        if (enfermeras.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay enfermeras registrados", "Mostrar enfermeras",
            JOptionPane.WARNING_MESSAGE);
        else {
            for (enfermeras m: enfermeras)
                m.mostrar();
            }
	}
}
