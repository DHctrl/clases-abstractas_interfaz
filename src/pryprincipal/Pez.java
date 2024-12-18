
package pryprincipal;

public class Pez extends Animal {

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }
    

    @Override
    public void comer() {
        System.out.println(nombre + " TIENE UNA EDAD DE " + edad +  " ESTA COMIENDO en su pecera");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " QUEIRE DORMIR ");
    }

}
