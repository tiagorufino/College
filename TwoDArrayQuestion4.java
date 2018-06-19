import java.util.Scanner;
public class TwoDArrayQuestion4{
    public static void main(){
        
        int [][] twoDimentionsArray = new int[3][3];
        int average = 0;
        Scanner scan = new Scanner(System.in);
        for (int row = 0; row<twoDimentionsArray.length; row++){
            for (int column = 0; column<twoDimentionsArray[row].length; column++){
                twoDimentionsArray[row][column] = scan.nextInt();
                average += twoDimentionsArray[row][column];                
            }
        }
        
        for (int row = 0; row<twoDimentionsArray.length; row++){
            for (int column = 0; column<twoDimentionsArray[row].length; column++){
                System.out.print(twoDimentionsArray[row][column]+" ");
                if(column==twoDimentionsArray[row].length-1){
                    System.out.println();
                }
            }
        }
        
        System.out.println("The average is "+ average/(twoDimentionsArray.length*twoDimentionsArray[0].length));
    }
}
