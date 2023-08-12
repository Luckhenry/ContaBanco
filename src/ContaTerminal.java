import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //ToDo List: Conhecer e importar a classe Scanner

       double saldo = 2500.35; 
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


       //ToDo List: Exibir as mensagens para o nosso usuário

       System.out.println("Digite seu nome: ");
       String nome = scanner.next();
       
       System.out.println("Digite seu sobrenome: ");
       String sobrenome = scanner.next();

       System.out.println("Por favor, digite o nome da Agência: ");
       String agencia = scanner.next();

       System.out.println("Por favor, digite a conta: ");
       int conta = scanner.nextInt();

        //ToDo List: Obter pela classe scanner os valores digitados no terminal

       //ToDo List: Exibir a mensagem final, da conta criada

       System.out.println("Olá " + nome + " " + sobrenome + "," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque!");
    }
}
