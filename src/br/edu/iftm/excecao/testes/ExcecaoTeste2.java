package br.edu.iftm.excecao.testes;

public class ExcecaoTeste2 {

    public static void dividir(int[] numeros) {
        numeros[6] = 2 / 5;
    }

    public static void main(String[] args) {
        int[] numeros = new int[] { 1, 3, 5, 9 };
        int[] pesos = new int[] { 5, 0, 4 };

         dividir(numeros);
        for (int i = 0; i < numeros.length; i++) {
            try {
                // abrir o arquivo que você quer ler;
                // você lê o conteúdo do arquivo;
                // dividir(numeros);
                int resultado = numeros[i] / pesos[i];
                System.out.printf("%d / %d = %d \n", numeros[i], pesos[i], resultado);
                // }catch(Exception e){
                // System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Houve um problema ao acessar o indice do array");
            } catch (ArithmeticException e) {
                // System.out.println("Houve um erro no calculo: ");
                // System.out.println(e.getMessage());
                e.printStackTrace();
                // }finally{
                // //fechar o arquivo que você abriu
                // //codigo vai ser executado
                // System.out.println("Código dentro do finally");
            }
        }

        System.out.println("Mensagem executada após o erro");

    }
}
