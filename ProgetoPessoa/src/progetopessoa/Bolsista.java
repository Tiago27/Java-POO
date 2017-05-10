
package progetopessoa;

public class Bolsista extends Aluno{
    private float bolsa;
    
    public void RenovarBolsa(){
        System.out.println("Bolsa renovada de "+this.getNome());
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista e paga com desconto");
    }
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
