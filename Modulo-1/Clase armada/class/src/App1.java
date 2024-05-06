public class App1 {
    public static void main(String[] args) {
        // Crear una instancia de Persona con nombre y edad
        Persona p1 = new Persona("Juan", 30);

        // Imprimir detalles de la persona
        System.out.println("Detalles de la persona:");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Fecha de Nacimiento: " + p1.getFechaNacimiento());

        // Cambiar la edad
        p1.setEdad(31);

        // Imprimir nueva edad y detalles
        System.out.println("Después de cambiar la edad:");
        System.out.println("Nueva edad: " + p1.getEdad());

        // Imprimir la representación completa de la persona
        System.out.println(p1.toString());
    }
}
