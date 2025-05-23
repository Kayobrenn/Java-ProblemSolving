package NOTA4;

import java.util.Random;

public class SomaComThreads {
    public static final int TAMANHO_VETOR = 40;
    public static final int NUM_THREADS = 4; // Deve ser divisor exato do TAMANHO_VETOR

    public static void main(String[] args) {
        int[] vetor = new int[TAMANHO_VETOR];
        Random rand = new Random();

        // Preenchendo o vetor com valores aleatórios de 1 a 100
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor[i] = rand.nextInt(100) + 1;
        }

        ThreadSum[] threads = new ThreadSum[NUM_THREADS];
        int blocosPorThread = TAMANHO_VETOR / NUM_THREADS;

        // Instancia e inicia as threads
        for (int i = 0; i < NUM_THREADS; i++) {
            int inicio = i * blocosPorThread;
            int fim = inicio + blocosPorThread;
            threads[i] = new ThreadSum(vetor, inicio, fim, i);
            threads[i].start();
        }

        // Aguarda todas as threads finalizarem
        int somaTotal = 0;
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
                somaTotal += threads[i].getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Soma total do vetor: " + somaTotal);
    }
}
