import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação para inserir o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitação para inserir o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Solicitação para inserir o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitação para inserir o saldo
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibição das informações da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo + ".");
        System.out.println("Essas informações estão disponíveis para saque.");

        // Fechamento do scanner
        scanner.close();
    }
}