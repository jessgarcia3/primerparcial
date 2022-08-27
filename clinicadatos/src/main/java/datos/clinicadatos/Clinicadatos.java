package datos.clinicadatos;

import java.util.ArrayList;

public final class Clinicadatos {

    static gestorpacientes pacientes = new gestorpacientes();
    static gestormedicos medicos = new gestormedicos();
    static gestorenfermeras enfermeras = new gestorenfermeras();
    
    public static void main(String[] args){
        pacientes.nuevoPaciente();
	pacientes.mostrarPacientes();
        medicos.nuevoMedico();
	medicos.mostrarMedicos();
        enfermeras.nuevoenfermera();
        enfermeras.mostrarenfermeras();
    }
}
