import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String agencia, nomeUsuario;
        double saldo;

        System.out.println("Por favor, digite o número da conta!");
        numero = teclado.nextInt();

        System.out.println("Por favor, digite a Agência!");
        agencia = teclado.next();

        System.out.println("Agora, entre com o seu nome!");
        nomeUsuario = "Teste";
        nomeUsuario = teclado.nextLine();

        System.out.println("Entre com o saldo para depósito, por favor!");
        saldo = teclado.nextDouble();

        System.out.println("Olá "+ nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia+ ", conta" + numero + "e seu sado " + saldo + " está disponível para saque.");

}
}
