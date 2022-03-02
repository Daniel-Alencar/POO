/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author engenheiro
 */
public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au!");
    }
    
    // Polimorfismo de sobrecarga
    public void reagir(String frase) {}
    public void reagir(int hora, int minuto) {}
    public void reagir(boolean dono) {}
    public void reagir(int idade, float peso) {}
}
