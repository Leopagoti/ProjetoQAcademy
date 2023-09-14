package poo;

import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Controla se a calculadora deve continuar executando
        boolean continueCalculating = true;

        // Loop principal
        while (continueCalculating) {
            // Solicita ao usuário que digite um número inteiro
            System.out.print("Digite o número inteiro: ");

            // Verifica se o próximo valor inserido é um número inteiro
            if (scanner.hasNextInt()) {
                // Armazena o número inserido na variável 'result'
                int result = scanner.nextInt();

                // Loop interno para realizar operações contínuas até o usuário decidir calcular ou sair
                while (true) {
                    // Solicita ao usuário que digite um operador (+, -, *, /) ou '=' para calcular, ou 'x' para sair: 
                    System.out.print("Digite o operador (+, -, *, /) ou '=' para calcular, ou 'x' para sair: ");
                    char operator = scanner.next().charAt(0);

                    // Verifica se o usuário deseja sair do programa
                    if (operator == 'x' || operator == 'X') {
                        continueCalculating = false;
                        System.out.println("\u001B[34mCalculadora encerrada\u001B[0m"); // Mensagem em azul
                        break;
                    } else if (operator == '=') {
                        System.out.println("\u001B[32mSeu resultado é: " + result + "\u001B[0m"); // Mensagem em verde
                        break;
                    }

                    // Solicita ao usuário que digite o próximo número inteiro
                    System.out.print("Digite o próximo número inteiro: ");

                    // Verifica se o próximo valor inserido é um número inteiro
                    if (scanner.hasNextInt()) {
                        // Armazena o próximo número na variável 'nextNum'
                        int nextNum = scanner.nextInt();

                        // Realiza a operação com base no operador inserido
                        switch (operator) {
                            case '+':
                                result += nextNum;
                                break;
                            case '-':
                                result -= nextNum;
                                break;
                            case '*':
                                result *= nextNum;
                                break;
                            case '/':
                                if (nextNum != 0) {
                                    result /= nextNum;
                                } else {
                                    System.out.println("Não é possível dividir por zero.");
                                    return;
                                }
                                break;
                            default:
                                System.out.println("Operador inválido.");
                                return;
                        }
                    } else {
                        System.out.println("\u001B[31mValor incorreto\u001B[0m"); // Mensagem de erro em vermelho
                        scanner.next(); // Limpa a entrada inválida
                    }
                }
            } else {
                // Verifica se o próximo valor inserido é "X" ou "x" para sair
                if (scanner.hasNext("[Xx]")) {
                    continueCalculating = false;
                    System.out.println("\u001B[34mCalculadora encerrada\u001B[0m"); // Mensagem em azul
                } else {
                    System.out.println("\u001B[31mValor incorreto\u001B[0m"); // Mensagem de erro em vermelho
                    scanner.next(); // Limpa a entrada inválida
                }
            }
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
