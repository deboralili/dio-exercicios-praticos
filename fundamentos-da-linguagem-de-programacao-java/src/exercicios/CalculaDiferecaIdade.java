package exercicios;

import java.util.Scanner;

/*
 * Exercício 4: Escreva um código que receba o nome e a idade de 2 pessoas 
 * e imprima a diferença de idade entre elas
 */

public class CalculaDiferecaIdade {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        var scanner = new Scanner(System.in);

        // Solicita a idade da primeira pessoa
        System.out.println("Digite a idade da primeira pessoa em anos:");

        // Lê a idade da primeira pessoa
        int idade1 = scanner.nextInt();

        // Solicita a idade da segunda pessoa
        System.out.println("Digite a idade da segunda pessoa em anos:");

        // Lê a idade da segunda pessoa
        int idade2 = scanner.nextInt();

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();

        // Calcula a diferença de idade entre as duas pessoas e garante que seja um
        // valor positivo
        int diferenca = Math.abs(idade1 - idade2);

        // Imprime a diferença de idade
        System.out.println("A diferença de idade entre as duas pessoas é de " + diferenca + " anos.");

    }
}

/*
 * Aprendizado:
 * 
 * - math.abs(): Utilizado para garantir que o valor seja sempre positivo.
 */