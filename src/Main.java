import model.Account;
import model.Client;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Client client = new Client("Adriana G", "12345678900", "11999999999", "adri@teste.com");
       Account account = new Account(1, client);
       Scanner in = new Scanner(System.in);

       System.out.println("===== JBank =====");
       int options = 100;
       while(options != 0){
           System.out.println("What would you like to do?\n" +
                   "\n" +
                   "1 - Check balance\n" +
                   "2 - Deposit\n" +
                   "3 - Withdraw\n" +
                   "4 - View account holder details\n" +
                   "0 - Exit\n");
           options = in.nextInt();
           if(options == 1){
               System.out.println("The updated balance is: " + account.getBalance());
           } else if(options == 2){
               System.out.print("What is the deposit amount?");
               double amount = in.nextDouble();
               boolean result = account.deposit(amount);
               if(!result){
                   System.out.println("The deposit cannot be made. The amount must be greater than 0.");
               }else{
                   System.out.println("Deposit successful!");
               }
           } else if(options == 3){
               System.out.println("What is the withdraw amount?");
               double amount = in.nextDouble();
               boolean result = account.withdraw(amount);
               if(!result){
                   System.out.println("Withdrawal is not possible due to insufficient funds.");
               }else{
                   System.out.println("Withdrawal successful!");
               }
           } else if(options == 4){
               System.out.println(client);
           }
       }
        System.out.println("JBank wishes you an excellent day. G'bye");
        in.close();
    }
}
