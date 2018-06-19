public class TwoDArrayQuestion5{
    public static void main(){
        int [][] matrix = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12}};
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column< matrix[row].length; column++){
                System.out.print(matrix[row][column]+" ");
                if(column==matrix[row].length-1){
                    System.out.println();
                }
            }
        }
        System.out.println();
        int [][] transposedMatrix = new int [matrix[0].length][matrix.length];
        
        for (int row = 0; row < transposedMatrix.length; row++){
            for (int column = 0; column< transposedMatrix[row].length; column++){
                transposedMatrix[row][column] = matrix[column][row];
                System.out.print(transposedMatrix[row][column]+" ");
                if(column==transposedMatrix[row].length-1){
                    System.out.println();
                }
            }
        }
        
    }
}
