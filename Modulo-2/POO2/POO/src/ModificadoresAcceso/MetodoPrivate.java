package ModificadoresAcceso;

public class MetodoPrivate {
    private String nombre = "Juan";
    
    public void saludar(){
        System.out.println("Hola qye takl estas" + mostrarNombre());
    }
    private String mostrarNombre(){
    return nombre;
    }
}
