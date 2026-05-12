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

        guerrero.vida -= 30;
        System.out.println("Vida guerrero: " + guerrero.vida);
        System.out.println("Vida mago:     " + mago.vida);

        System.out.println("\n--- Estado de personajes ---");
        guerrero.mostrarEstado();
        mago.vida = 15;
        mago.mostrarEstado();
        arquero.vida = 0;
        arquero.mostrarEstado();
    }
}
