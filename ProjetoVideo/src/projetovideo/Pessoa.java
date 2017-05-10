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
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected byte experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    protected void ganharExp(byte exp){
        this.setExperiencia(exp+=1);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(byte experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "\n      nome=" + nome + "\n      idade=" + idade + "\n      sexo=" + sexo + "\n      experiencia=" + experiencia + "\n   }";
    }

}
