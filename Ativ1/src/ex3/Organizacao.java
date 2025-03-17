package ex3;

import java.util.Scanner;

public class Organizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º elemento da lista: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite o valor de k: ");
        int k = scanner.nextInt();

        int aux;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= k) {
                System.out.print(A[i] + " ");
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > k) {
                System.out.print(A[i] + " ");
            }
        }

        scanner.close();
    }
}