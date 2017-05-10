/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Tiago
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    //Métodos publicos
    public void apresentar(){
        System.out.println("------------------------------------------");
        System.out.print("Chegou a hora o lutador " + this.getNome());
        System.out.print(" diretamente de " + this.getNacionalidade());
        System.out.print("pesando "+this.getPeso());
        System.out.print(" tem "+this.getIdade()+" de idade, ");
        System.out.print(this.getAltura()+" de altura ");
        System.out.println("pesando "+this.getPeso()+"Kg");
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }
    public void Status(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Nome: "+this.getNome()+" é um peso: "+this.getCategoria());
        System.out.println("Galhou: "+this.getVitorias()+" vezes");
        System.out.println("Perdeu: "+this.getDerrotas()+" vezes");
        System.out.println("Empatou: "+this.getEmpates()+" vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLura(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Métodos Especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválida";
        }else if(this.peso <= 70.3){
            this.categoria="Leve";
        }else if (this.peso <= 83.9) {
            this.categoria="Médio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
