package logica;

public class UsuarioEps extends Usuario{

    public UsuarioEps(String nombre, String apellido, long cedula, String correo) {
        super(nombre, apellido, cedula, correo);
    }
    @Override
    public String obtenerTipo() {
        return "EPS";
    }


}
