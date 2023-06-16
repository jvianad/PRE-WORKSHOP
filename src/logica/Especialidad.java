package logica;

public class Especialidad {
    private String nombre;
    private int codigo;
    private String tipoEspecialidad;

    public Especialidad(String nombre, int codigo, String tipoEspecialidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipoEspecialidad = tipoEspecialidad;
    }

    @Override
    public String toString() {
        return tipoEspecialidad;
    }
}
