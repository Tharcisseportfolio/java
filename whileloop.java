/**
 * while
 */

import java.util.Scanner;

public class While{

    public static void loopings() {
            boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while(run == true){
            System.out.print("Name :");
            String name  = scanner.nextLine();
            System.out.println("The name is :" + name);

            if(name.toLowerCase().equals("tharcisse")){
                System.out.println("The loop to be closed");
                run = false;
            }else{
                System.out.println("The loops is still runing.");

            }
        }
    }


    public static void main(String[] args) {
        loopings();
        
    }
    
}