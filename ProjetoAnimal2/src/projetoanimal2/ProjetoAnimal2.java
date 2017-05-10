/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoanimal2;

/**
 *
 * @author Tiago
 */
public class ProjetoAnimal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro x = new Cachorro();
        x.reagir("Olá");
        x.reagir("Vai apanhar");
        x.reagir(11, 45);
        x.reagir(21, 00);
        x.reagir(true);
        x.reagir(false);
        x.reagir(2, 12.5f);
        x.reagir(17, 4.5f);
    }
}
