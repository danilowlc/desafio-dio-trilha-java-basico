import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        var sc = new Scanner(System.in);

        System.out.print("Olá, qual é o seu Nome? ");
        String nome = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Agora, digite o número da conta: ");
        int numero = Integer.valueOf(sc.nextLine());

        System.out.print("Qual valor deseja depositar para iniciar sua conta? ");
        double saldoConta = Double.valueOf(sc.nextLine());
        
        System.out.println();
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldoConta+" já está disponível para saque.");
    }
}
