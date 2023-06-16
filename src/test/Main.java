package test;

import logica.*;

public class Main {
    public static void main(String[] args) {
        UsuarioEps usuarioeps = new UsuarioEps("jean","viana",1254896258,"jviana@gmail.com");
        UsuarioParticular usuarioparticular = new UsuarioParticular("jose","henao",1045498521,"jhenao@gmail.com");
        UsuarioPoliza usuariopoliza = new UsuarioPoliza("jesus","perez",1058698546,"jperez@gmail.com");
        Especialidad especialidadueps = new Especialidad("medicina",1,"MEDICINA GENERAL");
        Especialidad especialidaduparticular = new Especialidad("MEDICINA INTERNA",2,"MEDICINA INTERNA");
        Especialidad especialidadupoliza = new Especialidad("MEDICINA DEL DEPORTE",3,"MEDICINA DEL DEPORTE");

        Hospital hospital = new Hospital();

        hospital.agendarCita(especialidadueps,usuarioeps,"23 de enero del 2024");
        System.out.println();
        hospital.agendarCita(especialidaduparticular,usuarioparticular,"30 febrero del 2030");
        System.out.println();
        hospital.agendarCita(especialidadupoliza,usuariopoliza,"15 de marzo del 2024");


    }
}
