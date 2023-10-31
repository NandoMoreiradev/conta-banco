import java.util.Scanner;

public class ContaTerminal {

    // Atributos da classe
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.coletarDados();
        conta.exibirMensagem();
    }

    // Método para coletar os dados via terminal
    public void coletarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        this.numero = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        System.out.println("Por favor, digite o número da Agência!");
        this.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        this.saldo = scanner.nextDouble();
    }

    // Método para exibir a mensagem ao usuário
    public void exibirMensagem() {
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero 
                        + " e seu saldo R$" + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
