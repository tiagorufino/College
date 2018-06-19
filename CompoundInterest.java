import java.util.Scanner;
import javax.swing.JOptionPane;
public class CompoundInterest
{
    public static void main(String[] args)
    {
        System.out.printf("%.2f\n", balance(0.0, 0.0, 0.0));
    }
    public static double balance(double principal, double rate, double years) {
    
    double InvestmentAmount = 0;
    Scanner kb = new Scanner(System.in);

    System.out.print("\n Enter the initial investment amount: ");
    principal = kb.nextDouble();

    System.out.print("Enter the interest rate: ");
    rate = kb.nextDouble();

    System.out.print("Enter the number of years: ");
    years = kb.nextDouble();
    System.out.printf("%5s %10s %10s %10s", "years", "StartOfYear", "Interest", "EndOfYear");
    for (int i = 1; i < years; i++) {
        
        InvestmentAmount = principal * Math.pow(1.0 + rate, years);
        InvestmentAmount += principal;
    }
    
    return InvestmentAmount - principal;
 
}
}
        