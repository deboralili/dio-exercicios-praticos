package exercicios;

import java.util.Scanner;

/*
 * Exercicio 3: Escreva um código que o usuário entre com um primeiro 
 * número, um segundo número maior que o primeiro e escolhe entre a opção 
 * par e impar, com isso o código deve informar todos os números pares ou 
 * ímpares (de acordo com a seleção inicial) no intervalo de números informados, 
 * incluindo os números informados e em ordem decrescente;
 */

public class IntervaloParImpar {
    public static void main(String[] args) {

        // Scanner para ler a entrada do usuário
        var scanner = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Informe o primeiro número: ");

        // Lê o primeiro número
        int primeiroNumero = scanner.nextInt();

        // Solicita o segundo número
        System.out.print("Informe o segundo número (maior que o primeiro): ");

        // Lê o segundo número
        int segundoNumero = scanner.nextInt();

        // Verifica se o segundo número é maior que o primeiro
        if (segundoNumero <= primeiroNumero) {

            // Continua solicitando até que o usuário informe um número válido
            do {
                System.out.println("O segundo número deve ser maior que o primeiro, por favor digite novamente.");
                segundoNumero = scanner.nextInt();
            } while (segundoNumero <= primeiroNumero);
        }

        // Solicita a escolha entre números pares ou ímpares
        System.out.print("Deseja ver números pares ou ímpares? (P/I): ");

        // Lê a escolha do usuário e converte para maiúscula
        String escolha = scanner.next().toUpperCase();

        // Fecha o scanner
        scanner.close();

        // Enunciado do resultado
        System.out.printf("Números %s entre %d e %d em ordem decrescente:%n",
                escolha.equals("P") ? "pares" : "ímpares",
                primeiroNumero,
                segundoNumero);

        // Loop para imprimir os números pares ou ímpares em ordem decrescente
        switch (escolha) {
            case "P":
                for (int i = segundoNumero; i >= primeiroNumero; i--) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case "I":
                for (int i = segundoNumero; i >= primeiroNumero; i--) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            default:
                break;
        }
    }
}

/*
 * Aprendizado:
 * - Uso de do-while se a condição precisa ser verificada após a execução do
 * bloco de código.
 * - Uso de switch-case para executar diferentes blocos de código com base na
 * escolha do usuário.
 * O break é usado para evitar a execução "fall-through".
 * O default pode ser usado para tratar casos não previstos.
 * - Uso do elvis operator (?:) para atribuir valores com base em uma condição.
 * - Uso de loops for para iterar sobre um intervalo onde o indice é utilizado.
 */