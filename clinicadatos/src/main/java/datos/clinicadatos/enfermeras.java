package datos.clinicadatos;

import javax.swing.JOptionPane;

public class enfermeras {
    private String id;
    private String nombre;
    private String apellidos;
    private String areadetrabajo;
    
    public enfermeras(String id, String nombre, String apellidos, String areadetrabajo){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.areadetrabajo = areadetrabajo;
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
    public String getAreadetrabajo(){
        return areadetrabajo;
    }
    public void setAreadetrabajo(String areadetrabajo){
        this.areadetrabajo = areadetrabajo;
    }
    
    public void mostrar(){
        String mensaje = "Identificador enfermera: " + id + "\nNombre: " + nombre
			+ "\nApellidos: " + apellidos + "\nArea de trabajo: " + areadetrabajo;
	JOptionPane.showMessageDialog(null, mensaje, "Mostrar enfermera", JOptionPane.INFORMATION_MESSAGE);
    }
}
