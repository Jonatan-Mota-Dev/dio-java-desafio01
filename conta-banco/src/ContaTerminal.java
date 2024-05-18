import java.util.Scanner;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

    
        System.out.println("Por favor digite seu Nome:");
        nomeCliente = scan.next();

        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        numeroAgencia = scan.next();

        System.out.println("Quanto deseja depositar?: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é:" + numeroAgencia + ", conta:" + numeroConta + " e seu saldo: " + saldo + " já está disponível para saque.");
        

        
    }
}
