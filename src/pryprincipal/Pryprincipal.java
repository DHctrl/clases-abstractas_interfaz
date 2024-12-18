
package pryprincipal;

import java.util.Scanner;

public class Pryprincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int elejir, edades;
        
        System.out.println("ELIJA EL ANIMAL QUE DESEA INICIAR ");
        System.out.println("1. iniciemos con perro");
        System.out.println("2. iniciemos con PEZ");
        elejir = entrada.nextInt();
        entrada.nextLine();
        
        switch(elejir){
            case 1:
                System.out.println("Coloquemos un nombre a la bestia querida");
                nombres = entrada.nextLine();
                System.out.println("ponle la edad del perrito");
                edades = entrada.nextInt();
                Perro perro = new Perro(nombres, edades);
                perro.comer();
                perro.dormir();
                perro.jugar();
                perro.mostrarcariño();
                break;
            case 2:
                System.out.println("Nombre del pecesito");
                nombres = entrada.nextLine();
                System.out.println("coloque la edad del pez");
                edades = entrada.nextInt();
                Pez pez = new Pez(nombres, edades);
                pez.comer();
                pez.dormir();
                break;
            default:
                System.out.println("elije bien la opcion ");
        }


    }
    
    
}
