public class TwoDArrayQuestionMagicBox{
    public static void main(){
        int [][] magicBox = new int [3][3];
        /**
         * the sum of the all the positions is the same value of the others
         * try to calculate the possible suns
         * 
         * the first rule is the total the values of the line of is equal to the average multiply by the rows
         * eg: a sequence of 1 to 9 is equal to the total of the line multiply by the numbers of the rows, in this case will be 3 rows, 
         * then (1+2+3+4+5+6+7+8+9) = 65 / 3 = 15
         *  
         * the second rule is the central number is the sum divided for the line. Eg: 15 / 3 = 5. this is the central number of the matrix
         * 
         * the third rule is one diagonal of the matrix is sequencial. eg: central number is 5 then the first is 4 and the last is 6
         */
        boolean check = false;
        int total = magicBox.length * magicBox[0].length;

        int [] numbersInserted = new int[total];

        int sumOfAllNumbers = 0;
        for(int i=0; i<= total; i++){
            sumOfAllNumbers += i;
        }

        int valueOfMagic = sumOfAllNumbers / magicBox.length;

        //value for check
        int centralNumber = valueOfMagic / magicBox.length;
        //first diagonal number
        int diagonalNumber = centralNumber - magicBox.length/2;

        //putting the central number
        magicBox[magicBox.length/2][magicBox.length/2] = centralNumber;

        // feeding the diagonal numbers
        for (int row = 0; row < magicBox.length; row++){
            for (int column = 0; column < magicBox[row].length; column++){
                if (row==column){
                    magicBox[row][column] = diagonalNumber;
                    numbersInserted[diagonalNumber-1] = diagonalNumber;
                    diagonalNumber++;
                } else {
                    //this insert the first combination the smallest number
                    if (row==1 && column==0){
                        magicBox[row][column] = diagonalNumber - 2;
                    } else {
                        magicBox[row][column] = 0;
                    }
                }
                //this insert the second combination the biggest number
                if (row==magicBox.length-1 && column==magicBox[row].length-1){
                    magicBox[row-1][column]= diagonalNumber;
                    numbersInserted[diagonalNumber-1] = diagonalNumber; 
                }                
            }
        }

        
        testValue(magicBox, valueOfMagic);
        
        
        //print
        for (int row = 0; row < magicBox.length; row++){
            for (int column = 0; column< magicBox[row].length; column++){
                System.out.print(magicBox[row][column]+" ");
                if(column==magicBox[row].length-1){
                    System.out.println();
                }
            }
        }
    } 
    
    
    private static boolean testValue(int [][] magicBox, int valueOfMagic){
        int total = 0;
        int numberColumn = 0;
        // Insert numbers
        for (int row = 0; row < magicBox.length; row++){
            for (int column = 0; column < magicBox[row].length; column++){
                if (magicBox[row][column]==0){
                    numberColumn = column;
                } else {
                    total += magicBox[row][column];
                }
            }
            magicBox[row][numberColumn] = total - valueOfMagic;
        }
        return false;
    }
}
