public class Main {
    public static void main(String[] args) {
        Cliente persona = new Cliente();

        persona.nombre = "Pablo";
        persona.edad = 60;
        persona.telefono = 4687921;
        String credito = persona.credito;

        System.out.println("Nombre persona: " + persona.nombre);
        System.out.println("Edad persona: " + persona.edad);
        System.out.println("Telefono persona: " + persona.telefono);
        System.out.println("Credito persona: " + credito);

        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Marie";
        trabajador.edad = 18;
        trabajador.telefono = 5468091;
        int salario = trabajador.salario;

        System.out.println("Nombre trabajador: " + trabajador.nombre);
        System.out.println("Edad trabajador: " + trabajador.edad);
        System.out.println("Telefono trabajador: " + trabajador.telefono);
        System.out.println("Credito trabajador: " + salario);
    }
}