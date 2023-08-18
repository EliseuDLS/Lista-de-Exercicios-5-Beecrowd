//exercício "Quermesse" da prova (comentado)
import java.util.Scanner;
public class Eliseu_2189_Quermesse {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //declaração das variáveis
        int numParticipantes = 0;
        int ingressoVencedor = 0;

        //variável para acompanhar o número dos casos de teste
        int j = 0; 

        do {
            //chama o método que lê o número de participantes do sorteio
            numParticipantes = lerNumParticipantes(numParticipantes);

            //se o número de participantes for 0, encerra o loop
            if (numParticipantes == 0) {
                break;
            }

            //criação do vetor para armazenar os valores dos ingressos
            int valorIngressos[] = new int[numParticipantes];

            //chama o método que lê os valores dos ingressos
            lerValorIngressos(valorIngressos);

            //chama o método que calcula o ingresso vencedor
            ingressoVencedor = calcularVencedor(valorIngressos);

            //incrementa o contador junto com os casos de teste
            j++;

            //imprime o número do teste realizado, o número do ingresso do participante que ganhou e uma linha em branco
            imprimirVencedor(ingressoVencedor, j);

        //loop continua enquanto o número de participantes não for 0
        } while (numParticipantes != 0);
    }

    //método que lê o número de participantes do sorteio
    public static int lerNumParticipantes(int numParticipantes) {
        do {
            numParticipantes = LER.nextInt();
        } while (numParticipantes < 0 || numParticipantes > 10000);

        return numParticipantes;
    }

    //método que lê os valores dos ingressos
    public static int[] lerValorIngressos(int[] valorIngressos) {
        for (int i = 0; i < valorIngressos.length; i++) {
            valorIngressos[i] = LER.nextInt();
        }

        return valorIngressos;
    }

    //método que verifica se o valor do ingresso é igual à posição atual mais 1, se for, retorna o valor do ingresso vencedor e retorna 0 se não encontrar um ingresso vencedor
    public static int calcularVencedor(int[] valorIngressos) {
        for (int i = 0; i < valorIngressos.length; i++) {
            if (valorIngressos[i] == i + 1) {

                return valorIngressos[i]; 
            }
        }

        return 0; 
    }

    //método que imprime o número do teste realizado, o número do ingresso do participante que ganhou e uma linha em branco
    public static void imprimirVencedor(int ingressoVencedor, int j) {
        System.out.println("Teste " + j);
        System.out.println(ingressoVencedor);
        System.out.println();
    }
}