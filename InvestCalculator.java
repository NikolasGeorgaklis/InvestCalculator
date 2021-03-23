//By Nikolas Georgaklis
import java.util.*;
import java.text.NumberFormat;
public class InvestCalculator
{
   public static void main(String[] args)
   {
      double interest, balance, initVal, targetVal, intRate;
      int year=0, yesno;
      
      Scanner scan = new Scanner(System.in);
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      do
      {
         System.out.print("Please enter your initial investment: ");
         initVal = scan.nextDouble();
         System.out.print("Please enter your target value: ");
         targetVal = scan.nextDouble();
         System.out.print("Please enter interest rate (for example, enter 5 for 5%): ");
         intRate = scan.nextDouble();
         
         System.out.println();
         System.out.println("Starting balance: "+fmt.format(initVal)+"  Interest Rate: "+intRate+"%");
         System.out.println();
         
         System.out.println("Year   Interest   Balance");
         
         balance = initVal;
         year = 0;
         
         do
         {
            year++;
            interest = ((0.01*intRate)*balance);
            balance += interest;
            System.out.println(year+"     "+fmt.format(interest)+"    "+fmt.format(balance));
         }
         while (balance<=targetVal);
         
         System.out.println();
         System.out.println("After "+year+" years at "+intRate+"%, your initial investment will be valued at "+fmt.format(balance));
         
         System.out.println();
         System.out.print("Do another? (1=yes, 0=no)");
         yesno = scan.nextInt();
         System.out.println();
         System.out.println();
      }
      while(yesno==1);
   }
}