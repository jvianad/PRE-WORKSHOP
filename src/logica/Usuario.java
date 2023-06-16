package logica;
public class Usuario {
    private String nombre;
    private String apellido;
    private long cedula;
    private String correo;

    public Usuario(String nombre, String apellido, long cedula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String obtenerTipo() {
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", correo='" + correo + '\'' +
                '}';
    }
}
