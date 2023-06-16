package logica;

public class UsuarioPoliza extends Usuario{

    public UsuarioPoliza(String nombre, String apellido, long cedula, String correo) {
        super(nombre, apellido, cedula, correo);
    }

    @Override
    public String obtenerTipo() {
        return "POLIZA";
    }
}
