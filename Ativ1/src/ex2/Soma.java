package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Soma {
    
    // Complexidade: O(n^3)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite o tamanho da lista: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º elemento da lista: ");
            lista.add(scanner.nextInt());
        }
        System.out.println();
        System.out.println("Lista: " + (lista));
        System.out.println();

        String res = verificarSoma(lista);
        System.out.println(res);

        scanner.close();
    }

    public static String verificarSoma(ArrayList<Integer> lista) {
        for (int i = 2; i < lista.size(); i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    if (j != k && lista.get(i) == lista.get(j) + lista.get(k)) {
                        return "Existe um elemento que é a soma de dois anteriores: " + lista.get(j) + " + " + lista.get(k) + " = " + lista.get(i);
                    }
                }
            }
        }
        return "Nenhum elemento é a soma de dois anteriores.";
    }

}
