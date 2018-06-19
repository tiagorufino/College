import java.util.Scanner;

public class ne
{
    public static void main(String[] args) 
    
    
    {   int numberCounter = 0;
        double total = 0.0;
        double number;
        Scanner kb = new Scanner(System.in);
        do {
                           
            System.out.print("Input a number, (0 to end)");
            number = kb.nextDouble();
            total += number;
            numberCounter++;
        }
        while (number !=0);
            numberCounter--;
            System.out.format("The total of the "+ numberCounter+ "numbers entered is %fn", total);
        }
        }
        
    

      