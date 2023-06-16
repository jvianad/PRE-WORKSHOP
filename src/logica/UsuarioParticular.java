package logica;

public class UsuarioParticular extends Usuario{

    public UsuarioParticular(String nombre, String apellido, long cedula, String correo) {
        super(nombre, apellido, cedula, correo);
    }
    @Override
    public String obtenerTipo() {
        return "PARTICULAR";
    }
}
