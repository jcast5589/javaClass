package ModificadoresAcceso;

public class PerroExtdAnimal extends Animal {
    
    public void ladrar(){
        System.out.println("gua gua");

    }

    @Override
    protected void comer(){
        System.out.println("El perro esta comiendo su purina o croquetas");
    }
}
