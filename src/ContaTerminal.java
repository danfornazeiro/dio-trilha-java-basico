import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main (String[] args) {
    //TODO: conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //Exibir mensagens para o nosso usuario
    //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome : ");
        String nome = scanner.next();
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

    //Exibir mensagem de conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
