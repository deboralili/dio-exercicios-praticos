package exercicios;

import java.util.Scanner;

/*
 * Exercicio 2: Escreva um código onde o usuário entra com sua altura e peso, 
 * seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida 
 * a mensagem de acordo com o resultado:
Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */

public class CalculaIMC {
    public static void main(String[] args) {

        // Criar um objeto Scanner para ler a entrada do usuário
        var scanner = new Scanner(System.in);

        // Solicitar ao usuário que informe sua altura
        System.out.print("Informe sua altura (em metros): ");

        // Ler a altura informada pelo usuário
        double altura = scanner.nextDouble();

        // Solicitar ao usuário que informe seu peso
        System.out.print("Informe seu peso (em kg): ");

        // Ler o peso informado pelo usuário
        double peso = scanner.nextDouble();

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();

        // Calcular o IMC
        double imc = peso / Math.pow(altura, 2);

        // Exibir o resultado do IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Determinar a categoria do IMC e exibir a mensagem correspondente
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}

/*
 * Aprendizado:
 * - nextDouble() é um método da classe Scanner que lê a próxima entrada do
 * usuário como um número de ponto flutuante (double).
 * Double é um tipo de dado em Java que representa números de ponto flutuante
 * de precisão dupla, ou seja, números que podem ter casas decimais.
 * - if é usado para executar um bloco de código se uma condição for verdadeira.
 * - else if é usado para testar uma nova condição se a condição anterior for
 * falsa.
 * - else é usado para executar um bloco de código se todas as condições
 * anteriores forem falsas.
 */