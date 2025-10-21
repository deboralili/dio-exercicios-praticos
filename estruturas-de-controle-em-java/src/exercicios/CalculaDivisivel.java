package exercicios;

import java.util.Scanner;

/*
 * Exercicio 4: Escreva um código onde o usuário informa um número 
 * inicial, posteriormente irá informar outros N números, a execução 
 * do código irá continuar até que o número informado dividido pelo 
 * primeiro número tenha resto diferente de 0 na divisão, números 
 * menores que o primeiro número devem ser ignorados
 */

public class CalculaDivisivel {
    public static void main(String[] args) {

        // Scanner para leitura do console
        var scanner = new Scanner(System.in);

        // Solicita o número inicial
        System.out.println("Informe um número:");

        // Lê o número inicial
        int numeroInicial = scanner.nextInt();

        // Loop infinito até o usuário errar
        while (true) {
            // Solicita o próximo número
            System.out.println("Informe um número que voce acha que é divisivel pelo numero inicial:");

            // Lê o próximo número
            int outroNumero = scanner.nextInt();

            // Verifica se o número é menor que o inicial
            if (outroNumero < numeroInicial) {

                // Informa que o número é menor e continua o loop
                System.out.println("Tente novamente, número menor que o inicial.");
                continue;
            }

            // Verifica se o número é divisível pelo número inicial
            if (outroNumero % numeroInicial != 0) {

                // Informa que o número não é divisível e encerra o loop
                System.out.printf("%d não é divisível por %d, que pena, GAME OVER\n",
                        outroNumero, numeroInicial);
                break;

                // Se for divisível, informa que acertou
            } else {
                System.out.printf("Voce acertou! %d é divisível por %d! Vamos de novo?\n",
                        outroNumero, numeroInicial);
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
