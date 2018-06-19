import java.util.*;

public class RainFall {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int stations = 1;
        double []rainfall = {-1,-1,-1,-1,-1};
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i<rainfall.length; i++){            
            while (rainfall[i] <0 || rainfall[i] >10){
                System.out.print("Enter the Rainfall in mm for Station " +stations+":");
                rainfall[i] = scan.nextDouble();
                System.out.println();
            }
            sum += rainfall[i];
            stations++;
        }
        average=sum/5;
        System.out.println("Average Rainfall=" +average);
        int max=0, min=0;
        for (double rain : rainfall){
            if (rain > average){
                max++;            
            }else{
                min++;            
            }
        }
        System.out.println("Number of stations with rainfall above the average = " +max);
        System.out.println("Number of stations with rainfall at or below the average =" +min);
    }
}
