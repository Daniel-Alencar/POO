/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

/**
 *
 * @author engenheiro
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.status();
        
        // Atributos que posso modificar
        // public
        c1.cor = "Preto";
        c1.modelo = "BIC";
        
        // protected
        c1.tampar();
        c1.carga = 5;
    }
    
}
