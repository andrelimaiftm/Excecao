package br.edu.iftm.excecao.testes;

import br.edu.iftm.excecao.erros.ControleRemoto;
import br.edu.iftm.excecao.erros.ControleRemotoException;
import br.edu.iftm.excecao.erros.TvDesligadaException;
import br.edu.iftm.excecao.erros.TvLigadaException;

public class ControleRemotoTese {
    public static void main(String[] args) {
        
        ControleRemoto controle = new ControleRemoto();
        try {
           // controle.ligar();
            //controle.ligar();
            //controle.desligar();
            controle.aumentarVolume();
            controle.aumentarVolume();
            controle.aumentarVolume();                        
        } catch (TvDesligadaException e) {
            System.out.println("Erro #1");
            System.out.println(e.getMessage());
        } catch (TvLigadaException e) {
            System.out.println("Erro #2");
            System.out.println(e.getMessage());
        } catch (ControleRemotoException e) {
            System.out.println("Erro #3");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro #4");
            System.out.println(e.getMessage());
            // TODO Auto-generated catch block
            //System.out.println("Houve um erro ao usar a TV");
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("olá");
        
    }

    


    
}
