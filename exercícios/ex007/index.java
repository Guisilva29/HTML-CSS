import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        String operacao, continuar;

        // Inicializando o resultado
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        resultado = num1;

        do {
            // Solicitar operação
            System.out.print("Escolha a operação (+, -, *, /): ");
            operacao = scanner.next();

            // Solicitar segundo número
            System.out.print("Digite outro número: ");
            num2 = scanner.nextDouble();

            // Realizar operação conforme a escolha
            switch (operacao) {
                case "+":
                    resultado += num2;
                    break;
                case "-":
                    resultado -= num2;
                    break;
                case "*":
                    resultado *= num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado /= num2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continue;  // Volta para a entrada do próximo número sem realizar a operação
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue;  // Volta para a entrada do próximo número sem realizar a operação
            }

            // Exibe o resultado da operação
            System.out.println("Resultado atual: " + resultado);

            // Perguntar se deseja continuar
            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        // Finaliza a calculadora
        System.out.println("Calculadora finalizada! Resultado final: " + resultado);
        scanner.close();
    }
}
