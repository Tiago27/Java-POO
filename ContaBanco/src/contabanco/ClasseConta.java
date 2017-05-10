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
public class ClasseConta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
   public void Status(){
       System.out.println("Número da conta: "+this.getNumConta());
       System.out.println("Tipo de Conta: "+this.getTipo());
       System.out.println("Dono da conta: "+this.getDono());
       System.out.println("Saldo da conta: "+this.getSaldo());
       System.out.println("Status da conta: "+this.getStatus());     
   }    
    
   public void abrirConta(String tipoConta){
       this.setTipo(tipoConta);
       this.setStatus(true);
       if (tipo == "cc") {
           this.setSaldo(50);
       }else if(tipo == "cp"){
           this.setSaldo(150);
       }
   }
   
   public void fecharConta(){
       if(this.getSaldo() > 0){
           System.out.println("Conta ainda tem dinheiro não pode fecha-la");
       }else if(getSaldo() < 0){
           System.out.println("Conta esta em debito empossivel encerrar");
       }else{
           this.setStatus(false);
           System.out.println("Conta de "+getDono()+" fechada com sucesso!");
       }
   }
   public void sacar(float sacar){
       if(this.getStatus()){
           if(this.getSaldo() >= sacar){
               this.setSaldo(getSaldo() - sacar);
               System.out.println("Saque de R$"+sacar+" autorizado na conta de "+this.getDono());
           }else{
               System.out.println("Saldo insuficiente para saque!");
           }
       }
   }
   
   public void depositar(float depositar){
        if(this.getStatus()){
            this.setSaldo(getSaldo() + depositar);
            System.out.println("Deposito de R$"+depositar+" na conta de "+this.getDono());
        }else{
             System.out.println("Conta fechada, não consigo depositar!");
        }   
   }
   
   public void pagarMensalidade(){
       int pm=0;
       if (this.getTipo() == "cc") {
           pm =12;
       }else if (this.getTipo()== "cp"){
           pm = 20;
       }    
       if (this.getStatus()) {
           this.setSaldo(this.getSaldo() - pm);
           System.out.println("Mensalidade de R$"+pm+" debitada da conta de "+this.getDono() );
       }else{
           System.out.println("Problema com a conta");
       }
   }

   public ClasseConta(){
      this.setSaldo(0);
      this.setStatus(false);
      System.out.println("Conta criada com sucesso!");
   }
   
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
}
