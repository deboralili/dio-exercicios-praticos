package exercicios;

import java.util.Scanner;

/*
 * Exercício 3: Escreva um código que receba a base e a altura de um 
 * retângulo, calcule sua área e exiba na tela. Fórmula: área=base X altura
 */

public class CalculaAreaRetangulo {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        var scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o tamanho da base do retângulo
        System.out.println("Digite o tamanho da base do retângulo em cm:");

        // Lê o tamanho da base inserida pelo usuário
        var base = scanner.nextFloat();

        // Solicita ao usuário que insira a altura do retângulo
        System.out.println("Digite a altura do retângulo em cm:");

        // Lê a altura inserida pelo usuário
        var altura = scanner.nextFloat();

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Calcula a área do retângulo
        var area = base * altura;

        // Exibe o resultado no console
        System.out.printf("A área do retângulo é: %.2f cm²%n", area);

    }
}
