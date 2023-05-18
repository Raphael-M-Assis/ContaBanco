import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para usar o ponto como separador de casas decimais

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Digite a agência: ");
        agencia = sc.next();
        sc.nextLine(); // Consumir o \n

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println
            (
                    "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                    ", sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo
                    + " já está disponível para saque."
            );

        sc.close(); // Fechar o Scanner
    }
}