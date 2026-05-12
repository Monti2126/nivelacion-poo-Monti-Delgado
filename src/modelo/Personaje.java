/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Estudiante
 */




public class Personaje {

    public String nombre;
    public String clase;
    public int nivel;
    public double vida;
    public double vidaMaxima;
    public int ataque;
    public int defensa;

    public Personaje(String nombre, String clase,
                     double vidaMax, int ataque, int defensa) {
        this.nombre     = nombre;
        this.clase      = clase;
        this.nivel      = 1;
        this.vida       = vidaMax;
        this.vidaMaxima = vidaMax;
        this.ataque     = ataque;
        this.defensa    = defensa;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s Nv%d | HP:%.0f/%.0f",
                clase, nombre, nivel, vida, vidaMaxima);
    }

    public void mostrarEstado() {
        double porcentaje = (vida / vidaMaxima) * 100;
        int relleno = (int) (porcentaje / 10);
        String barra = "#".repeat(relleno) + ".".repeat(10 - relleno);

        String estado;
        if      (porcentaje <= 0)  estado = "MUERTO";
        else if (porcentaje <= 25) estado = "CRITICO";
        else if (porcentaje <= 50) estado = "HERIDO";
        else if (porcentaje <= 75) estado = "ESTABLE";
        else                       estado = "SALUDABLE";

        System.out.printf("[%s] %.0f%% - %s%n", barra, porcentaje, estado);
    }
}