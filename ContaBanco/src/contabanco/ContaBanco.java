/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author Tiago
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ClasseConta p1 = new ClasseConta();
      p1.abrirConta("cc");
      p1.setDono("Jubileu");
      p1.setNumConta(1111);
      p1.depositar(300);
      p1.pagarMensalidade();
      p1.Status();
      
      ClasseConta p2 = new ClasseConta();
      
      p2.setDono("Creuza");
      p2.setNumConta(2222);
      p2.depositar(500);
      p2.sacar(630);
      p2.pagarMensalidade();
      p2.fecharConta();
      p2.Status();
    }
    
}
