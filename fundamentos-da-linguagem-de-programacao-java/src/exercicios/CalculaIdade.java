package exercicios;

/*
 * Exercício 1: Escreva um código que receba o nome e o ano de nascimento de
 * alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */

import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        var scanner = new Scanner(System.in);

        // Definindo o ano atual
        var anoAtual = 2025;

        // Solicitando o nome do usuário
        System.out.println("Escreva seu nome:");

        // Lendo o nome do usuário
        var nome = scanner.nextLine();

        // Solicitando o ano de nascimento do usuário
        System.out.println("Escreva seu ano de nascimento:");

        // Lendo o ano de nascimento do usuário
        var anoNascimento = scanner.nextInt();

        // Calculando a idade
        var idade = anoAtual - anoNascimento;

        // Fechando o scanner
        scanner.close();

        // Imprimindo a mensagem com o nome e a idade do usuário
        System.out.printf("Olá %s, você tem %d anos.%n", nome, idade);
    }
}

/*
 * Aprendizado:
 * 
 * - Uso do Scanner para entrada de dados.
 * - next() lê a próxima palavra até um espaço.
 * - nextLine() lê uma linha completa de texto.
 * - nextInt() lê um número inteiro.
 * - close() fecha o Scanner após o uso para evitar vazamentos de recursos.
 * 
 * - Imprimindo mensagens no console.
 * - print() imprime texto sem quebrar a linha.
 * - println() imprime uma linha de texto e quebra a linha.
 * - printf() imprime uma linha de texto e permite formatar strings com
 * variáveis.
 * - %s é usado como placeholder para strings.
 * - %d é usado como placeholder para inteiros.
 * - %n é usado para quebrar a linha.
 */