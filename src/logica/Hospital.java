package logica;

public class Hospital {
    private double valorBaseAPagar;
    public Hospital() {
    }
    public double calcularValorBaseCita(Usuario usuario){
        valorBaseAPagar=0;
        if (usuario.obtenerTipo().equals("EPS")){
            valorBaseAPagar=30000;
        } else if (usuario.obtenerTipo().equals("POLIZA")) {
            valorBaseAPagar=40000;
        } else if (usuario.obtenerTipo().equals("PARTICULAR")) {
            valorBaseAPagar=70000;
        }
        return valorBaseAPagar;
    }

    public void agendarCita(Especialidad especialidad, Usuario usuario, String fechaCita){
        System.out.println("Cita agendada:");
        System.out.println("Usuario: "+usuario);
        System.out.println("Fecha: "+fechaCita);
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Valor a pagar: "+calcularValorBaseCita(usuario));
    }



}
