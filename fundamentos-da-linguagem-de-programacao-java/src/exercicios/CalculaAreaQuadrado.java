package exercicios;

import java.util.Scanner;

/*
 * Exercício 2: Escreva um código que receba o tamanho do lado de um quadrado,
 * calcule sua área e exiba na tela. Fórmula: área=lado X lado
 */

public class CalculaAreaQuadrado {
    public static void main(String[] args) {
        // Criação do Scanner para leitura de dados
        var scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do lado do quadrado
        System.out.println("Digite o tamanho do lado do quadrado em cm:");

        // Lê o valor do lado como float
        float lado = scanner.nextFloat();

        // Fecha o scanner
        scanner.close();

        // Cálculo da área do quadrado manualmente
        float area = lado * lado;

        // Cálculo da área do quadrado usando Math.pow
        float area2 = (float) Math.pow(lado, 2);

        // Exibe os resultados formatados com duas casas decimais (manual)
        System.out.printf("Área do quadrado calculada manualmente: %.2f cm²%n", area);

        // Exibe os resultados formatados com duas casas decimais (Math.pow)
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