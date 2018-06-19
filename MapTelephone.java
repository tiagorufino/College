import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTelephone{
    
    public static void main(String args[]){
                
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your choose");
        System.out.println("1 - Insert");
        System.out.println("2 - Remove");
        System.out.println("3 - Print");
        System.out.println("4 - Exit");
        int choose = scan.nextInt();
        Map<String, String> agenda = new HashMap<>();
        String name = "";
        String number = "";
        do{
            switch (choose){
                case 1:
                    System.out.println("Insert the name of your contact");
                    name = scan.next();
                    System.out.println("Insert the number of your contact");
                    number = scan.next();
                    agenda.put(name, number);
                    System.out.println("This is your agenda in the moment:");
                    System.out.println(agenda);
                    System.out.println("Type your choose again");
                    System.out.println("1 - Insert");
                    System.out.println("2 - Remove");
                    System.out.println("3 - Print");                    
                    System.out.println("4 - Exit");
                    choose = scan.nextInt();
                    break;
                case 2:
                    System.out.println("Insert the name of the contact you want the remove");
                    name = scan.next();
                    if (null!=agenda.get(name) && !agenda.get(name).equals("")){
                        agenda.remove(name);
                    } else {
                        System.out.println("You do not have this contact");
                    }
                    System.out.println("This is your agenda in the moment:");
                    System.out.println(agenda);
                    System.out.println("Type your choose again");
                    System.out.println("1 - Insert");
                    System.out.println("2 - Remove");
                    System.out.println("3 - Print");
                    System.out.println("4 - Exit");
                    choose = scan.nextInt();
                    break;
                case 3:
                    Set<String> setCodes = agenda.keySet();
                    Iterator<String> iterator = setCodes.iterator();    
                    while(iterator.hasNext()){
                        System.out.println("Name   /   Number");
                        String code = iterator.next();
                        String result = agenda.get(code);
                        System.out.println(code +" / " + result);
                    }
                    System.out.println("Type your choose again");
                    System.out.println("1 - Insert");
                    System.out.println("2 - Remove");
                    System.out.println("3 - Print");                    
                    System.out.println("4 - Exit");
                    choose = scan.nextInt();
                    break;
                case 4:
                    break;
            }
        }while(choose!=4);
        
    }   
    
    
}


;