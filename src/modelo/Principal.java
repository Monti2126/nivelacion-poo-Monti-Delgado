package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
import modelo.Personaje;



public class Principal {

    public static void main(String[] args) {

        Personaje guerrero = new Personaje("Aragorn", "Guerrero", 100, 18, 12);
        Personaje mago     = new Personaje("Gandalf", "Mago",     70,  28,  5);
        Personaje arquero  = new Personaje("Legolas", "Arquero",  85,  22,  8);

        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);

        // Usar metodos en vez de acceso directo
        guerrero.recibirDano(25);
        guerrero.curar(10);
        System.out.println(guerrero.estaVivo());

        // Probar setNivel
        guerrero.setNivel(0);
        System.out.println("Nivel: " + guerrero.getNivel());  // 1
        guerrero.setNivel(75);
        System.out.println("Nivel: " + guerrero.getNivel());  // 50
        guerrero.setNivel(10);
        System.out.println("Nivel: " + guerrero.getNivel());  // 10

        // Probar clase invalida
        Personaje raro = new Personaje("Sauron", "Dios", 200, 40, 20);
        System.out.println(raro);

        // Mostrar estado
        System.out.println("\n--- Estado ---");
        guerrero.mostrarEstado();
        mago.mostrarEstado();
    }
}
