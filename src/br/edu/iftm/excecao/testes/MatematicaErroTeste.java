package br.edu.iftm.excecao.testes;

import br.edu.iftm.excecao.erros.Matematica;

public class MatematicaErroTeste {
    public static void main(String[] args) {

        Matematica matematica = new Matematica();
        try {
            matematica.divisao(5, 0);
        } catch (Exception e) {
            System.out.println("Houve erro: ");
            e.printStackTrace();
        }

    }
}
