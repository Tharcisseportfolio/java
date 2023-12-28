import java.util.Scanner;

public class dowhile {
    public static void loops() {
        Scanner scanner = new Scanner(System.in);
        
        boolean run = true;

        do{
            System.out.print("Name here :");
            String name = scanner.nextLine();
            if(name.toLowerCase().equals("tharcisse")){
                System.out.println("The name is "+ name);
                run = false;
            }else{
                System.out.println("The loops to be continued ...");
                run = true;
                // scanner.close();
            }

        }
        while(run == true); // it executes this line if the run is not true otherwise, it executes once and quites.
        
    }
    public static void main(String[] args) {
        loops();
        
        
    }
        
}
