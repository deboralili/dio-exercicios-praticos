package exercicios;

import java.util.Scanner;

/*
 * Exercicio 1: Escreva um código onde o usuário entra com um número 
 * e seja gerada a tabuada de 1 até 10 desse número;
 */

public class CalculaTabuada {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        var scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.println("Digite um número para ver sua tabuada de 1 a 10:");

        // Lê o número inserido pelo usuário
        int numero = scanner.nextInt();

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Exibe a tabuada do número inserido
        System.out.println("Tabuada de " + numero + ":");

        // Loop para calcular e exibir a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {

            // Calcula o resultado da multiplicação
            int resultado = numero * i;

            // Exibe o resultado formatado
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

/*
 * Aprendizado:
 * - O for é uma estrutura de controle que permite repetir um bloco de código
 * um número específico de vezes, controlado por uma variável de iteração.
 * - Pode ser usado para iterar sobre arrays, listas ou qualquer coleção de
 * dados.
 * - É usado quando o número de iterações é conhecido antecipadamente e a
 * variável
 * de iteração pode ser utilizada dentro do loop.
 */