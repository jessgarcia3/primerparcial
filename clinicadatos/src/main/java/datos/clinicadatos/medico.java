package datos.clinicadatos;

import javax.swing.JOptionPane;

public final class medico {
    
    private String id;
    private String nombre;
    private String apellidos;
    private String especialidad;
    
    public medico(String id, String nombre, String apellidos, String especialidad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    public void mostrar(){
        String mensaje = "Identificador medico: " + id + "\nNombre: " + nombre
			+ "\nApellidos: " + apellidos + "\nEspecialidad: " + especialidad;
	JOptionPane.showMessageDialog(null, mensaje, "Mostrar medico", JOptionPane.INFORMATION_MESSAGE);
    }
}
