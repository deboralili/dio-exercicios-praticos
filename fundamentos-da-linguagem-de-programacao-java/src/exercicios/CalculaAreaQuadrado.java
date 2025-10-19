package exercicios;

import java.util.Scanner;

/*
 * Exercício 2: Escreva um código que receba o tamanho do lado de um quadrado,
 * calcule sua área e exiba na tela. Fórmula: área=lado X lado
 */

public class CalculaAreaQuadrado {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado em cm:");

        float lado = scanner.nextFloat();

        scanner.close();

        float area = lado * lado;

        float area2 = (float) Math.pow(lado, 2);

        System.out.printf("Área do quadrado calculada manualmente: %.2f cm²%n", area);

        System.out.printf("Área do quadrado calculada com pow: %.2f cm²%n", area2);
    }
}

/*
 * Aprendizado:
 * 
 * - nextFloat() do Scanner para ler números decimais.
 * - Uso de Math.pow() para calcular potências.
 * - %.2f para formatar saída com duas casas decimais.
 */