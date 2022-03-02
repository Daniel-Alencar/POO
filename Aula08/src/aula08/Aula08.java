/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08;

/**
 *
 * @author engenheiro
 */
public class Aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador lutadores[] = new Lutador[6];
        String names[] = new String[6];
        names[0] = "Daniel";
        names[1] = "João";
        names[2] = "Pedro";
        names[3] = "Zé";
        names[4] = "Vinícius";
        names[5] = "Maurício";
        
        for(int i = 0; i < 6; i++) {
            lutadores[i] = new Lutador(names[i], "Brasileiro", 20, 1.78f, "peso pesado");
        }
        
        Luta UEC = new Luta();
        UEC.marcarLuta(lutadores[0], lutadores[1]);
        UEC.lutar();
    }
}
