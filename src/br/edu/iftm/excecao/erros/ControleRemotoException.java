package br.edu.iftm.excecao.erros;

public class ControleRemotoException extends Exception{

    public ControleRemotoException(String mensagem){
        super("Controle remoto: "+ mensagem);        
    }
    
}
