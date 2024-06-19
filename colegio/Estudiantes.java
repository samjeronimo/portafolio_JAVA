package colegio;

public class Estudiantes{
    private String nombre;
    private String correo;
    private String carrera;
    private int edad;
    private boolean solvencia;

    public Estudiantes(String nombre, String correo, String carrera, int edad, boolean solvencia){
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
        this.solvencia = solvencia;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCorreo(){
        return correo;
    }

    public boolean getSolvencia() {
        return solvencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSolvencia(boolean solvencia) {
        this.solvencia = solvencia;
    }
}
