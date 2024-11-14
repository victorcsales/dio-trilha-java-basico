import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia!");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o primeiro nome do Cliente!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o sobrenome do Cliente!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o nome saldo do Cliente!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " +nomeCliente+ " " +sobrenomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +numeroAgencia+ ", conta " +numeroConta+ " e seu saldo " +saldo+ ", já está disponível para saque");

    }
}
