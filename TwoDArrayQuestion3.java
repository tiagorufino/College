public class TwoDArrayQuestion3{
    public static void main(){
        int index = 0;
        int value = 1;
        int [][] twoDimentionsArray = new int [9][9];
        
        
        
        for (int row = 0; row<twoDimentionsArray.length; row++){
            for (int column = 0; column<twoDimentionsArray[row].length; column++){
                if (row==column){
                    twoDimentionsArray[row][column] = 1;
                } else {
                    twoDimentionsArray[row][column] = 0;
                }
                if (row+column==twoDimentionsArray.length-1){
                    twoDimentionsArray[row][column] = 1;
                }
                System.out.print(twoDimentionsArray[row][column]);
                if(column==twoDimentionsArray[row].length-1){
                    System.out.println();
                }
            }                         
        }       
    }
}