import java.util.Scanner;

public class ArrayTelephone{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your choose");
        System.out.println("1 - Insert");
        System.out.println("2 - Remove");
        System.out.println("3 - Print");
        System.out.println("4 - Exit");
        int choose = scan.nextInt();
        String [] nameVector = new String[1];
        String [] numberVector = new String [1];
        do{
            switch (choose){
                case 1:                    
                System.out.println("Inser the name of your contact");
                nameVector = add(nameVector, scan.next());
                System.out.println("Insert the number of your contact");
                numberVector = add(numberVector, scan.next());
                System.out.println("This is your agenda in the moment:");
                System.out.println("Name    /    Number");
                for (int i = 0; i< nameVector.length; i++){                    
                    System.out.println(nameVector[i] + " / " + numberVector[i]);
                }
                nameVector = clone(nameVector);
                numberVector = clone(numberVector);
                System.out.println("Type your choose again");
                System.out.println("1 - Insert");
                System.out.println("2 - Remove");
                System.out.println("3 - Print");                    
                System.out.println("4 - Exit"); 
            }
        }while(choose!=4);
    }

    private static String [] clone(String[] vector){
        String [] clone = new String [vector.length+1];
        for (int i = 0; i < vector.length; i++){
            clone[i] = vector[i];
        }
        vector = new String [clone.length];
        vector = clone;
        return vector;
    }

    private static String [] add (String [] vector, String value){
        for (int i = 0; i < vector.length; i++){
            if (null == vector[i]){
                vector[i] = value;
            }   
        }
        return vector;
    }
}
