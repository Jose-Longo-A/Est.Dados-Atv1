/*
Implemente um programa em Java que reorganize um array de inteiros A contendo n
elementos de forma que todos os números menores ou iguais a um valor k fiquem antes dos
números maiores que k.

Regras e Restrições:
a) O algoritmo deve reorganizar os elementos in-place, ou seja, sem criar um novo array auxiliar.
b) O programa não pode usar recursividade.
c) O programa deve receber como entrada um array não ordenado e um valor inteiro k. Todos os valores 
devem ser informados pelo terminal.

Exemplo de Entrada: A = {8, 2, 7, 3, 10, 5, 1, 6} e k = 5.
Exemplo de Saída: Array reorganizado: 2 3 5 1 6 10 7 8 (Os números menores ou iguais a 5 aparecem antes 
dos maiores, sem exigir ordenação interna)

 */


public class ex3 {

    public static void main(String[] args) {
    
        int[] A = {1, 32, 10, 5, 2, 13, 15, 7, 8, 9};
        int k = 8;
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
    }    
}
