
package pryprincipal;


public class Perro extends Animal implements Mascota {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " CON " + edad +  " AÑOS ESTA JUGANDO CON LA PELOTA");
    }

    @Override
    public void mostrarcariño() {
        System.out.println(nombre + " ES MUY CARIÑOSO PERO TIENE " + edad + " AÑOS ");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " NO QUIERE COMER ");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " NO TIENE SUEÑO ");
    }

    
    
    
}
