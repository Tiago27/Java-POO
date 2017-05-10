
package ultraemojicombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// 0 1 2
            System.out.println("===========Resultado da Luta============");
            switch(vencedor){
                case 0://Empate
                    System.out.println("Empate!");
                    this.desafiado.empatarLura();
                    this.desafiante.empatarLura();
                    break;
                case 1://Ganhou Desafiado
                    System.out.println(this.desafiado.getNome()+" venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://Ganhou Desafiante
                    System.out.println(this.desafiante.getNome()+" venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;    
            }    
            System.out.println("======================================");
        }else{
            System.out.println("===========Resultado da Luta============");
            System.out.println("A luta não pode acontecer!");
            System.out.println("======================================");
        }
    }
    //Métodos Espediciais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
