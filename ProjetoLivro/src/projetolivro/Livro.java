/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;//variável de tipo abstrato
    
    public void detalhes(){
        System.out.println("Nome do livro: "+this.getTitulo()+"\nNome do autor: "+this.getAutor()+
                           "\nTotal de Páginas: "+this.getTotPaginas()+"\nO livro está aberto?: "+this.getAberto()+
                           "\nPágina Atual: "+this.getPagAtual()+"\nEstá com: "+this.leitor.getNome()+
                            "\n----------------------------------------");
                           
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
       this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }  

    @Override
    public void abrir() {
        if (this.getAberto()) {
            System.out.println("Livro já está Aberto");
        }else if (this.getAberto() == false) {
             this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto()) {
            this.setAberto(false);
        }else if (this.getAberto() == false) {
            System.out.println("Livro já está Fechado");
        }
    
        
    }

    @Override
    public void folhear(int paginas) {
        if(this.getAberto()){
            this.setPagAtual(paginas);
        }
    }

    @Override
    public void avancarPag() {
        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual()+1);
        }
        
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()) {
            this.setPagAtual(this.getPagAtual()-1);
        }
        
    }
}
    
