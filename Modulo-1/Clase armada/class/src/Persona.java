import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Persona {
    // Atributos (variables de instancia)
    private String nombre;
    private int edad;
    private Date fechaNacimiento;

    // Constructor para inicializar atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
        // Crear un calendario con la fecha actual
        Calendar calendar = Calendar.getInstance();
        
        // Restar la edad para obtener el año de nacimiento
        calendar.add(Calendar.YEAR, -edad);
        
        // Obtener la fecha de nacimiento
        this.fechaNacimiento = calendar.getTime();
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento);
    }

    // Método para calcular edad basado en fecha de nacimiento
    private int calcularEdad(Date fechaNacimiento) {
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);
        Calendar hoy = Calendar.getInstance();
        
        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
        
        if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        
        return edad;
    }
    
    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Persona{nombre='" + nombre + "', edad=" + edad + ", fecha de nacimiento='" + sdf.format(fechaNacimiento) + "'}";
    }
}
