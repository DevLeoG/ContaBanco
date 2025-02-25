import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);
    ContaTerminal conta = new ContaTerminal();

     System.out.println("Por favor, digite o número da Conta !");
     conta.numero = sc.nextInt();
     System.out.println("Por favor, digite o número da Agência !");
     conta.agencia = sc.next();
     System.out.println("Por favor, digite o Nome do Cliente !");
     conta.nomeCliente = sc.next();
     System.out.println("Por favor, digite o Saldo da Conta !");
     conta.saldo = sc.nextDouble();


     System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ conta.agencia + ", conta "+ conta.numero + 
     "\ne seu saldo "+ conta.saldo +" já está disponível para saque");

    }
}
