import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new  Scanner (System.in);
        System.out.println("Bem-vindo, ao banco do brasileiro!!");

        System.out.println("Por favor, nós informe o seu nome.");
        String name = scanner.nextLine();

        System.out.println("Por favor, informe a sua agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o número da sua conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor, informe o valor que deseja sacar.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência: " + agencia + ", conta: " + conta + " e seu saldo " + saldo + " já esta disponivel para saque. ");
    }
}
