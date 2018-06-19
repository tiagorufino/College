import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class StudentsMarks{
    /**
     * Main method of the program. The arguments need to be null if you do not want to run the mock.
     */
    public static void main(String[] mockNames, double[] mockMarks){
        //Initiated the scanner
        Scanner scan = new Scanner(System.in);
        //General verbs
        String [] names = new String[25];
        double [] marks = new double[25];
        String name = "";
        String testMark = "";
        double mark = 0.0;
        double average = 0.0;
        int totalStudents = 25;
        int markToPass = 40;
        int numberPass = 0;
        
        //running until the total of the students
        for (int i = 0; i< totalStudents; i++){
            System.out.print("Enter the student's Name: ");
            //If the mock is not running open the input for the user.
            if(null == mockNames || mockNames[i].isEmpty()){
                name = scan.nextLine();
            } else {
                name = mockNames[i];
                System.out.print(name);
            }
            
            System.out.println();
            
            //If the mock is not running open the input for the user.
            if(null == mockMarks || mockMarks[i]==0){
                //Check if is Double. If is not, catch the exception and try again.
                while(mark==0){
                    System.out.print("Enter the mark for "+ name+":");
                    testMark = scan.nextLine();
                    try {
                        mark = Double.parseDouble(testMark);
                    }catch(Exception e){
                        System.out.print("Enter the mark for "+ name+":");
                        testMark = scan.nextLine();
                    }
                    System.out.println();
                }
            }else {
                System.out.print("Enter the mark for "+ name+":");
                mark = mockMarks[i];
                System.out.println(mark);
            }
            
            
            
            //insert the values into the arrays
            names[i] = name;
            marks[i] = mark;
            
            //Sum the marks for calculate the average
            average += mark;
            
            //calculate the number of pass
            if (mark>=markToPass){
                numberPass++;
            }
            mark=0.0;
        }

        System.out.println();
        
        //report
        System.out.println("\t Examination Report");
        System.out.println("Name \t \t \t %Mark");
        //print the names and the marks
        double maximum = 0.0;
        double minimum = 100.0;
        for (int i=0; i<totalStudents;i++){
            System.out.println(names[i] +"\t \t "+ marks[i]);
            if(marks[i]>maximum){
                maximum=marks[i];
            }
            if(marks[i]<minimum){
                minimum = marks[i];
            }
        }
        //print the average/5
        System.out.println("Average Mark="+average/totalStudents);
        //print the numberof passes
        System.out.println("Number of Passes="+numberPass);
        //print the difference of totalStudents - Number of passes.
        System.out.println("Number of Failures="+(totalStudents-numberPass));
        //print the maximum.
        System.out.println("Number of maximum="+maximum);
        //print the minimum.
        System.out.println("Number of minimum="+minimum);
    }

    /**
     * Test class. Create a mock with the marks and the names and call the main method for test.
     */
    public static void testClass(){
        String [] mockNames = new String [25];
        double [] mockMarks = new double[25];
        Random random = new Random();
        for (int i = 0; i<25; i++){
            //Generate the random double number between 1 and 100.0
            mockMarks[i] = Math.random()*100.0;
            //generate the shuffle string
            mockNames[i] = shuffleString();
        }
        main(mockNames, mockMarks);
    }

    /**
     * Create a stirng with shuffles caracters using the Collection to shuffle the array and define a new structure
     */
    public static String shuffleString(){

        char[] caracteres = "abcdefghij".toCharArray();
        List<Character> ocharaters  = new ArrayList<Character>(caracteres.length);
        for (char c:  caracteres ){
            ocharaters.add(c);
        }
        Collections.shuffle(ocharaters);
        for ( int i =0; i < 5 ; i++ ){
            caracteres[i] = ocharaters.get(i);
        }
        return new String(caracteres);
    }
}
