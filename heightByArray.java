import java.util.Scanner;
/**
 * Write a description of class height here.
 *
 * @author (utshab)
 * @version (a version number or a date)
 */
public class heightByArray
{
     public static void main(String args[] )
     {
        final int N = 4;
        int avgHeight = 0;
        int abvAverage =0;
        Scanner kb = new Scanner(System.in);
        int[] heights=new int[N];
        for (int i= 0; i <heights.length; i++)
        {
            System.out.println("Please type height in cm of the "+ (i + 1) + "person");
            heights [i] = kb.nextInt();
        }
        int totalHeights =0;
        for (int i=0; i<heights.length; i++){
            
           totalHeights += heights[i];
            //Calculate Average = Total / N
        }
        
         avgHeight = totalHeights/4;
           for (int i=0; i<heights.length; i++){
           if (heights [i] >avgHeight)
           {
               abvAverage++;
            }
           }
           System.out.println("the average of 4 people is" + avgHeight);
           System.out.println("the total amount of people above average is "+abvAverage);
}
}
        
 
        
        
        
        
        
        
        
        
        
    