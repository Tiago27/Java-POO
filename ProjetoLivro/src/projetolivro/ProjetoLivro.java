/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Tiago
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p[]= new Pessoa[2];
        p[0] = new Pessoa("Pedro", "M", 24);
        p[1] = new Pessoa("Maria", "F", 32);
        
        Livro l[] =  new Livro[3];
        l[0] = new Livro("Java para Iniciantes", "Jose pereira", 200, p[0]);
        l[1] = new Livro("Java Intermediario", "Anita da silva", 500, p[0]);
        l[2] = new Livro("Java Avançado", "Bruna ferras", 400, p[1]);
        l[0].abrir(); 
        l[0].folhear(7);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].abrir(); 
        
        l[0].detalhes();
       // l[1].detalhes();
        //l[2].detalhes();
    }
    
}
