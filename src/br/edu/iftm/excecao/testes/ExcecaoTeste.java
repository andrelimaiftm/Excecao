package br.edu.iftm.excecao.testes;

public class ExcecaoTeste {
    public static void main(String[] args) {
        System.out.println("Mensagem antes do erro");
        int[] numeros = new int[4];
        try {
            // vai ficar o código que poderá conter possíveis erros
            // ou seja o que pode gerar as excessões
            numeros[5] = 10;
        } catch (Exception e) {
            // Manipular as exceções, tratar os erros;
            System.out.println("Gerou uma exceção");
            System.out.println("Houve um problema ao preencher o vetor");
            //System.out.println(e.getMessage());
        }

        // for (int i = 0; i < 5; i++) {
        // System.out.println(numeros[i]);
        // }
        System.out.println("Mensagem despois do erro");
    }
}
