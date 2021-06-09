package br.edu.iftm.excecao.erros;

public class ControleRemoto {

    private boolean estaLigado;
    private int volumeAtual;
    private boolean estaMudo;

    public ControleRemoto(){
        this.estaLigado = false;
        this.volumeAtual = 0;
        this.estaMudo = false;
    }

    public void ligar() throws Exception{
        if(estaLigado){
            TvLigadaException excecao =  new TvLigadaException();
            //Exception excecao = new Exception("A TV já está ligada!");
            throw excecao;
            //System.out.println("A TV já está ligada!");
        }else{
            System.out.println("A TV ligou");
            this.estaLigado = true;
        }
        

    }

    public void desligar() throws Exception{
        //!estaligado
        if(estaLigado == false){
            //Exception excecao = new Exception("A TV já está desligada");
            //throw excecao;
            throw new TvDesligadaException();
        }
        System.out.println("A TV desligou");
        this.estaLigado = false;
        
        
    }

    public void aumentarVolume() throws ControleRemotoException{
        if(volumeAtual > 60){
            throw new ControleRemotoException("O volume está no máximo");
        }
        //this.volumeAtual += 10;
        this.volumeAtual += 40;
        System.out.println("O volume é: " + this.volumeAtual);
    }

    public void diminuirVolume(){
        //this.volumeAtual -= 10;
        this.volumeAtual -= 40;
        System.out.println("O volume é: " + this.volumeAtual);
    }

    public void ativarMudo(){
        this.estaMudo = true;
        System.out.println("A TV está muda");
    }

    public void desligarMudo(){
        this.estaMudo = false;
        System.out.println("A TV não está muda");
    }

    //Método getter e setter
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
