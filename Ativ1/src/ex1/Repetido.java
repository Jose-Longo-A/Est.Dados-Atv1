package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Repetido {

    // Complexidade: O(n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite o tamanho da lista (maior ou igual a 2): ");
        int n = scanner.nextInt();
        while (n < 2) {
            System.out.println("Valor inválido. Deve ser maior ou igual a 2: ");
            n = scanner.nextInt();
        }

        System.out.println("Digite os elementos da lista (valores entre 1 e " + (n - 1) + "): ");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            while (val < 1 || val > n - 1) {
                System.out.println("Valor inválido. Digite um valor entre 1 e " + (n - 1) + ": ");
                val = scanner.nextInt();
            }
            lista.add(val);
        }

        int rep = encontrarRepetido(lista);
        if (rep != -1) {
            System.out.println("Número repetido : " + rep);
        } else {
            System.out.println("Não existe nenhum número repetido.");
        }

        scanner.close();
    }

    public static int encontrarRepetido(ArrayList<Integer> lista) {
        int[] cont = new int[lista.size()];
        for (int num : lista) {
            if (cont[num] == 1) {
                return num;
            }
            cont[num]++;
        }
        return -1;
    }

}
