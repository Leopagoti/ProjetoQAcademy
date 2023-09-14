package poo;  // Define o pacote em que a classe está localizada

import java.util.Scanner;  // Importa a classe Scanner para entrada de dados

public class Media {  // Declaração da classe "Media"
    public static void main(String[] args) {  // Método principal
        Scanner scanner = new Scanner(System.in);  // Criação de um objeto Scanner para leitura de entrada

        System.out.print("Quantidade de notas: ");  // Solicita ao usuário a quantidade de notas
        int quantidadeNotas = scanner.nextInt();  // Lê a quantidade de notas informada pelo usuário

        double somaNotas = 0;  // Inicialização da variável para armazenar a soma das notas
        for (int i = 1; i <= quantidadeNotas; i++) {  // Loop para ler as notas
            System.out.print("Insira a nota " + i + ": ");  // Solicita ao usuário uma nota específica
            double nota = scanner.nextDouble();  // Lê a nota informada pelo usuário
            somaNotas += nota;  // Adiciona a nota à soma das notas
        }
        

        double media = somaNotas / quantidadeNotas;  // Calcula a média das notas

        // Arredonda a média para o próximo meio ponto
        media = Math.round(media); // Multiplica por 2, arredonda e divide por 2 novamente

        // Mostrar o resultado com cores
        if (media >= 6.0) {
            System.out.print("\u001B[32m");  // Define a cor para verde (código ANSI)
        } else {
            System.out.print("\u001B[31m");  // Define a cor 4para vermelho (código ANSI)
        }

        System.out.println("Média: " + media);  // Imprime a média, colorida conforme o resultado
        
        // Reseta a cor após a impressão
        System.out.print("\u001B[0m");
        scanner.close();
    }
}

