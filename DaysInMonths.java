import java.util.Scanner;
/**
 * Write a description of class calender here.
 *
 * @author (utshab)
 * @version (a version number or a date)
 */
public class DaysInMonths
{
    public static void main(String[] args)
    {
        final int NUM_MONTHS = 12;
        int[]daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months= {"January","February","March", "April", "May", "June","July","August","September","October", "Novemember", "December"};
        int inputMonth,inputYear;
        Scanner kb=new Scanner(System.in);
        //Input a valid month
        do
        {
            System.out.print("Enter a month(1-12):");
            inputMonth=kb.nextInt();
        }
        while (inputMonth<1 || inputMonth>12);
        //Input a valid year
        do
        {
            System.out.print("Enter a year:");
            inputYear=kb.nextInt();
        }
        while (inputYear<0);
        //Check for leap year. Assume a leap year is any year divisible by 4.
        if (inputYear%4==0)
        daysInMonths[1]=29;
        //Display the number of days.
        System.out.format(" The number of days in %s %d is %d\n",
        months[inputMonth-1],inputYear,daysInMonths[inputMonth-1]);
    }
}

            
            
             

    