import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*To do: 
        Conhecer e importar a classe Scanner; 
        Exibir as mensagens para o usuário; 
        Obter pela classe Scanner os valores digitados no terminal; 
        Exibir a mensagem da conta criada.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("\tBanco DIO\nBem-vindo ao Banco DIO! Para criar a sua conta complete o cadastro abaixo:\nDigite o número da sua conta: ");
        int numeroConta = input.nextInt();
        System.out.println("Digite o número da agência: ");
        String numeroAgencia = input.next();
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = input.next();
        System.out.println("Digite o saldo bancário: ");
        Double saldoConta = input.nextDouble();
    }
}
