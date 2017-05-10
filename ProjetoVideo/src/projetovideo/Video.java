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
public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidadas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidadas = 0;
        this.reproduzindo = false;
    }
 
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidadas(this.curtidadas++);
    }

    @Override
    public String toString() {
        return "Video{" + "\n   titulo = " + titulo + "\n   avaliacao = " + avaliacao + "\n   views = " + views + "\n   curtidadas = " + curtidadas +   
"\n   reproduzindo = " + reproduzindo + "\n}";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int media=(int)(this.avaliacao + avaliacao)/this.getViews();
        this.avaliacao = media;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidadas() {
        return curtidadas;
    }

    public void setCurtidadas(int curtidadas) {
        this.curtidadas = curtidadas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
}
