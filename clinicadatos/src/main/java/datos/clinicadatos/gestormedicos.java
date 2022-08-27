package datos.clinicadatos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class gestormedicos {
    private ArrayList<medico> medicos;
	
    public gestormedicos() {
        medicos = new ArrayList<medico>();
    }
    public boolean nuevoMedico() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo Medico", JOptionPane.QUESTION_MESSAGE);
	String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo Medico", JOptionPane.QUESTION_MESSAGE);
	String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo Medico", JOptionPane.QUESTION_MESSAGE);
	String especialidad = JOptionPane.showInputDialog(null, "Especialidad:", "Nuevo Medico", JOptionPane.QUESTION_MESSAGE);

	medico nuevoMedico = new medico(id, nombre, apellidos, especialidad);
            return medicos.add(nuevoMedico);
	}

    public void mostrarMedicos() {
        if (medicos.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay medicos registrados", "Mostrar medicos",
            JOptionPane.WARNING_MESSAGE);
        else {
            for (medico m: medicos)
                m.mostrar();
            }
	}
}
