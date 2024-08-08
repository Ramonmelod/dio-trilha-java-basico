
import edu.models.ContaTerminal;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal m1= new ContaTerminal();


        System.out.println("Por favor, qual o seu nome?");
        Scanner scan = new Scanner(System.in);

        String getString = scan.next();
        m1.setClientName(getString);
   
        System.out.println("Por favor, digite o número da sua Agência!");
        
        getString = scan.next();
        m1.setAgency(getString);
    
        System.out.println("Por favor, digite o número da sua Conta!");
        int getInterger = scan.nextInt();
        m1.setAccoutNumber(getInterger);

        System.out.println("Por favor, digite o saldo da sua conta!");
        getInterger = scan.nextInt();
        scan.close();
        m1.setBalance(getInterger);
        
        System.out.println("Olá, " + m1.getClientName()+ "! obrigado por criar uma conta em nosso banco, sua agência é: " + m1.getAgency() 
        + ", conta: " + m1.getAccoutNumber() +" e seu saldo: R$ " + m1.getBalance() + " já está disponível para saque!");
        
        

    }
}
