/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovideo;

/**
 *
 * @author Tiago
 */
public class ProjetoVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
 
        
        Gafanhoto g[]= new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[0].viuMaisUm();
        g[1] = new Gafanhoto("Creuza", 12, "F", "crezita");
        
        Visualizacao vg[] = new Visualizacao[5];
        vg[0] = new Visualizacao(g[0], v[2]);
        vg[0].avaliar(80.0f);
        System.out.println(vg[0].toString());
        vg[1] = new Visualizacao(g[0], v[0]);
        System.out.println(vg[1].toString());
        vg[2] = new Visualizacao(g[1], v[2]);
        System.out.println(vg[2].toString());

        /*
        System.out.println("Vídeos\n----------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("\nGafanhotos\n----------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
    }
    
}
