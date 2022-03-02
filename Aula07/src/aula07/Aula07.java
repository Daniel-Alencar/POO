/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

/**
 *
 * @author engenheiro
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador lutadores[] = new Lutador[6];
        
        for(int i = 0; i < 6; i++) {
            lutadores[i] = new Lutador("Daniel", "Brasileiro", 20, 1.78f);
        }
        System.out.println("Altura: " + lutadores[0].getAltura());
    }
}
