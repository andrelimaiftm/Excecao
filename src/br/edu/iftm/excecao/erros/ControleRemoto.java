package br.edu.iftm.excecao.erros;

public class ControleRemoto {

    private boolean estaLigado;
    private int volumeAtual;
    private boolean estaMudo;

    public ControleRemoto() {
        this.estaLigado = false;
        this.volumeAtual = 0;
        this.estaMudo = false;
    }

    public void ligar() throws Exception {
        if (this.estaLigado) {
            TvLigadaException excecao = new TvLigadaException();
            //Exception excecao = new Exception("A TV já está ligada!");
            throw excecao;
        } else {
            this.estaLigado = true;
            System.out.println("A TV ligou");
        }

    }

    public void desligar() throws Exception {
        //!estaLigada
        if(this.estaLigado == false){
            //Exception excecao =  new Exception("A TV já está desligada!");
            throw  new  TvDesligadaException();
        }
        this.estaLigado = false;
        System.out.println("A TV desligou");

    }

    public void aumentarVolume() throws ControleRemotoException{
        if(this.volumeAtual > 60){
            throw new ControleRemotoException("O volume está no maximo");
        }
        //this.volumeAtual += 10;
        this.volumeAtual += 40;
        System.out.println("O Volume é: " + this.volumeAtual);

    }

    public void diminuirVolume() {
        //this.volumeAtual -= 10;
        this.volumeAtual -= 40;
        System.out.println("O Volume é: " + this.volumeAtual);
    }

    public void ativarMudo() {
        
        this.estaMudo = true;
        System.out.println("A TV está muda");
    }

    public void desligarMudo() {
        this.estaMudo = false;
        System.out.println("A TV não está muda");
    }

    // Métodos getter e setter
    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public boolean isEstaMudo() {
        return estaMudo;
    }

    public void setEstaMudo(boolean estaMudo) {
        this.estaMudo = estaMudo;
    }

}
