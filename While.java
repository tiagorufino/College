import java.util.Scanner;

public class While
{
    public static void main(String[] args) 
    
    
    {   int numberCounter = 1;
        double total = 1.0;
        double number = 0;
        Scanner kb = new Scanner(System.in);
        while (number!=1) {
            System.out.print ("Input a number, 1 in the end");
            number = kb.nextDouble();
            total *= number;
            numberCounter++;
        }
        numberCounter--;
        System.out.format("The total of the "+ numberCounter+ "numbers entered is %fn", total);
    }
}
      