package br.edu.iftm.excecao.testes;

import br.edu.iftm.excecao.erros.ControleRemoto;
import br.edu.iftm.excecao.erros.ControleRemotoException;
import br.edu.iftm.excecao.erros.TvDesligadaException;
import br.edu.iftm.excecao.erros.TvLigadaException;

public class ControleRemotoTeste {
    public static void main(String[] args) {
        
        ControleRemoto controleRemoto =  new ControleRemoto();
        try {
            controleRemoto.ligar(); 
            //controleRemoto.ligar();          
            controleRemoto.desligar();
            controleRemoto.aumentarVolume();
            controleRemoto.aumentarVolume();
            controleRemoto.aumentarVolume();
        } catch (TvDesligadaException e) {
            System.out.println("Erro #1");
            System.out.println(e.getMessage());
        }catch(TvLigadaException e){
            System.out.println("Erro #2");
            System.out.println(e.getMessage());
        }catch(ControleRemotoException e){
            System.out.println("Erro #3");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Erro #4");
            System.out.println(e.getMessage());
        }
        System.out.println("Ola");
    }
    
}
