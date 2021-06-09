package br.edu.iftm.excecao.erros;

public class TvDesligadaException extends ControleRemotoException{

    public TvDesligadaException(){
        super("A TV já está desligada!");
    }
    
}
