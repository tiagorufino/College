
public class ClassExercise{

    public static void main(){


        printSum(10);
        printSum(15);
        printSum(30);
        printSum(50);
        printSum(100);

    }

    private static void printSum(int total){
        
        int count = 1, sum = 0;
        while(count<=total){
            sum += count;
            if(count==total){
                System.out.println(sum);
            }
            count++;
        }
        
    }
}

