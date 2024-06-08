import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência");
        agencia = scan.nextLine();
        System.out.println("Número da conta:");
        numero = scan.nextInt();
        System.out.println("Nome do cliente: ");
        scan.nextLine();
        nomeCliente = scan.nextLine();
        System.out.println("Saldo da conta:");
        saldo = scan.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scan.close();
        
        
    }

}
