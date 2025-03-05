import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Por favor, digite o número da Agência !");
        String texto = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o Saldo da conta !");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é "
        + texto + ", conta " + numero + " seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}