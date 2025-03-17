package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangulo {
    int ladoA, ladoB, ladoC;
    double areaS, xC, yC, Cx, Cy;
    int P, p;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Triangulo> triangulos = new ArrayList<>();

        System.out.print("Quantos triângulos deseja criar? ");
        int quantidade = teclado.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Triângulo " + (i + 1) + ":");
            System.out.print("Digite o tamanho do lado A: ");
            int ladoA = teclado.nextInt();
            System.out.print("Digite o tamanho do lado B: ");
            int ladoB = teclado.nextInt();
            System.out.print("Digite o tamanho do lado C: ");
            int ladoC = teclado.nextInt();
            
            Triangulo t = new Triangulo(ladoA, ladoB, ladoC);
            triangulos.add(t);
        }

        System.out.println("\nResultados dos triângulos:");
        for (Triangulo t : triangulos) {
            t.imprimirDados();
        }

        teclado.close();
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        calcularValores();
    }

    private void calcularValores() {
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            P = ladoA + ladoB + ladoC;
            p = P / 2;
            areaS = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
            xC = (Math.pow(ladoB, 2) - Math.pow(ladoC, 2) + Math.pow(ladoA, 2)) / (2 * ladoA);
            yC = Math.sqrt(Math.pow(ladoB, 2) - Math.pow(xC, 2));
            Cx = (0 + ladoA + xC) / 3;
            Cy = (0 + 0 + yC) / 3;
        } else {
            areaS = -1;
        }
    }

    public void imprimirDados() {
        if (areaS != -1) {
            System.out.println("Lados: A=" + ladoA + ", B=" + ladoB + ", C=" + ladoC);
            System.out.println("Área S: " + areaS);
            System.out.println("Perímetro P: " + P);
            System.out.println("Centróide: Cx=" + Cx + ", Cy=" + Cy);
            System.out.println("----------------------");
        } else {
            System.out.println("Os lados " + ladoA + ", " + ladoB + " e " + ladoC + " não formam um triângulo válido.");
        }
    }

}

