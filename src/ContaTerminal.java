import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String nomeCliente;
        double saldo;
        String angecia;

        System.out.println("Bem vindo! Aqui você criara a sua conta Bancaria.");
        System.out.println("Para isso precisamos de algumas informações.");

        System.out.println("\nInforme o numro da conta: ");
        numero = scanner.nextInt();

        System.out.println("\nInforme a agecia da conta: ");
        angecia = scanner.next();
        scanner.nextLine();

        System.out.println("\nInforme o seu Nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("\nInforme o saldo da conta: ");
        saldo = scanner.nextDouble();


        System.out.println("\nConta criada com sucesso!!");
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ angecia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
