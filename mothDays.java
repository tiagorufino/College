import java.util.Scanner;

public class mothDays
{
    public static void main(String[] args) 
    
    
    {   
        int day;
        int month;
        int year;
        int nextDay;
        int nextMonth;
        int nextYear;
        
        Scanner kb = new Scanner(System.in);
       
     System.out.print("Enter the day: ");
       day = kb.nextInt();
        
     System.out.print("Enter the mouth: ");
       month = kb.nextInt();
     
     System.out.print("Enter the year: ");
         year = kb.nextInt();
               
                                   
    if (day >= 1 && day < 29 && month < 12)
    {
      nextDay = day + 1;
        System.out.println("Next day is " + nextDay+ "/" + month + "/" + year); 
    }
        
   if (day == 30 && month < 12) {
        
         nextDay = 01; 
         nextMonth = month + 1;
         System.out.println("Next day is " + nextDay+ "/" + nextMonth + "/" + year); 
        }
        
        if (day  >= 1 && day < 29  && month < 12) {
        
         nextDay = 01;
         nextMonth = month + 1;
         System.out.println("Next day is " + nextDay+ "/" + nextMonth + "/" + year); 
        }
        
        
        
    if (day == 30 && month == 12) {
        
         nextDay = 01;
         nextMonth = 01;
         nextYear = year + 1;
         System.out.println("Next day is " + nextDay + "/" + nextMonth + "/" + nextYear); 
        }

        
    }
}
    
    
    
