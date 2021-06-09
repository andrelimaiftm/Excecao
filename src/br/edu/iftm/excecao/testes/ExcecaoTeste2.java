package br.edu.iftm.excecao.testes;

public class ExcecaoTeste2 {

    private static void dividir(int[] numeros){
        //int[] numeros = new int[] {1, 3, 5, 9};
        numeros[6] = 2/5;

    }

    public static void main(String[] args) {
        int[] numeros = new int[] {1, 3, 5, 9};
        int[] pesos = new int[] {5, 0, 4};

        dividir(numeros);
        for (int i = 0; i < numeros.length; i++) {
            //try {
                //int resultado = numeros[i]*pesos[i];
                //int resultado = numeros[i]/pesos[i];
                //System.out.printf("%d X %d = %d \n",numeros[i],pesos[i], resultado);
                //System.out.printf("%d / %d = %d \n",numeros[i],pesos[i], resultado);
           /* } catch (Exception e) {
                System.out.println("Houve um erro no calculo: ");
                System.out.println(e.getMessage());
            }*/

            try {
                //abrir o arquivo que você quer ler;
                //você lê o conteúdo do arquivo;                

                //int resultado = numeros[i]/pesos[i];
                //System.out.printf("%d / %d = %d \n",numeros[i],pesos[i], resultado);
            } catch (ArrayIndexOutOfBoundsException e) {
            //} catch (Exception e) {
                //houve um erro na leitura do arquivo
                System.out.println("Houve um problema ao acessar o indice do array");
            }catch(ArithmeticException e){
                System.out.println("Acertou miseravi! Houve um erro de cáluclo!");
                //System.out.println(e.getMessage());
                e.printStackTrace();
            }finally{
                //fechar o arquivo que você abriu
                //codigo vai ser executado
                System.out.println("Código dentro do finally");
            }
            
        }
        System.out.println("Mensagem executada após o erro");
    }
    
}
