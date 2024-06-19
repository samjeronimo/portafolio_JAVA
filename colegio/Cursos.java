package colegio;

public class Cursos {
    private String Nombre;
    private String categoria;
    private String periodo;

    public Cursos(String Nombre, String categoria, String periodo){
        this.Nombre = Nombre;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    public String getNombre(){
        return Nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
