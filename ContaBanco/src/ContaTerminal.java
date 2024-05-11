import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nome = scanner.nextLine();

        double saldo = 237.48;

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
