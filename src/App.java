
import edu.models.BankAccountModel;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        BankAccountModel m1= new BankAccountModel();
        System.out.println("Por favor, digite o número da Agência!");
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.close();
        
      

    }
}
