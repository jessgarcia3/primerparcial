package datos.clinicadatos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class gestorpacientes {
    private ArrayList<paciente> pacientes;
	
    public gestorpacientes() {
        pacientes = new ArrayList<paciente>();
    }
    public boolean nuevoPaciente() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Identificador:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
	String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
	String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
	String genero = JOptionPane.showInputDialog(null, "Genero:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE);
	int edad = 0;
	try {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE));
            }
	catch (NumberFormatException e) {
	JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido", "Error", JOptionPane.WARNING_MESSAGE);
        }
	paciente nuevoPaciente = new paciente(id, nombre, apellidos, edad, genero);
            return pacientes.add(nuevoPaciente);
	}

    public void mostrarPacientes() {
        if (pacientes.isEmpty())
            JOptionPane.showMessageDialog(null, "No hay Pacientes registrados", "Mostrar Pacientes",
            JOptionPane.WARNING_MESSAGE);
        else {
            for (paciente p: pacientes)
                p.mostrar();
            }
	}
}

