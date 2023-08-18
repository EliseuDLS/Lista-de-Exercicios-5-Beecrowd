//exercício "A Corrida de Lesmas" da prova (comentado)
import java.util.Scanner;
public class Eliseu_1789_Lesmas {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //loop para processar múltiplos casos de teste
        while (LER.hasNext()){ 
        
            //declaração das variáveis
            int numeroLesmas = 0;
            int maiorValor = 0;

            //chama o método que lê o número de lesmas na corrida
            numeroLesmas = lerNumeroLesmas(numeroLesmas);

            //declaração do vetor representando as velocidades de cada lesma do grupo
            int velocidadeLesmas[] = new int[numeroLesmas];

            //declaração de variável
            int nivelVelocidade = 0;

            //chama o método que lê a velocidades de cada lesma do grupo
            velocidadeLesmas = lerVelocidadeLesmas(velocidadeLesmas);

            //chama o método que calcula qual é a lesma com a maior velocidade
            maiorValor = verificarMaiorValor(velocidadeLesmas);

            //chama o método que verifica qual lesma tem a maior velocidade dentre as do grupo
            verificarNivelVelocidade(velocidadeLesmas, nivelVelocidade, maiorValor);
        }
    }

    //método que lê o número total de lesmas da corrida que o usuário inserir, podendo entrar apenas valores maiores ou iguais a 1 ou menores ou iguais a 500
    public static int lerNumeroLesmas(int numeroLesmas) {
        do {
            numeroLesmas = LER.nextInt();
        } while (numeroLesmas < 1 || numeroLesmas > 500);

        return numeroLesmas;
    }

    //método que lê a velocidade de cada lesma que o usuário inserir do grupo percorrendo todas as posições do vetor
    public static int[] lerVelocidadeLesmas(int[] velocidadeLesmas) {
        for (int i = 0; i < velocidadeLesmas.length; i++) {
            velocidadeLesmas[i] = LER.nextInt();
        }

        return velocidadeLesmas;
    }

    //método que verifica qual é a lesma com a maior velocidade percorrendo todas as posições do vetor e comparando com a variável maiorValor (que é 0), se for maior que 0 a velocidade daquela iteração é a maior
    public static int verificarMaiorValor(int[] velocidadeLesmas) {
        int maiorValor = 0;

        for (int i = 0; i < velocidadeLesmas.length; i++) {
            if (velocidadeLesmas[i] > maiorValor) {
                maiorValor = velocidadeLesmas[i];
            }
        }

        return maiorValor;
    }

    //método que verifica o nível da velocidade da lesma mais rapida, usando um if simples comparando a variavel maiorValor com o valor de cada nível
    public static void verificarNivelVelocidade(int[] velocidadeLesmas, int nivelVelocidade, int maiorValor) {
        if (maiorValor < 10) {
            nivelVelocidade = 1;
        } else if (maiorValor >= 10 && maiorValor < 20) {
            nivelVelocidade = 2;
        } else if (maiorValor >= 20) {
            nivelVelocidade = 3;
        }

        //chama o método para imprimir o nível de velocidade da lesma
        imprimirNivelVelocidade(nivelVelocidade);
    }

    //método que imprime o nivel da velocidade da lesma mais veloz
    public static void imprimirNivelVelocidade(int nivelVelocidade) {
        System.out.println(nivelVelocidade);
    }
}