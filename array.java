//implementing an array and check if the element exists from the user input. The challenging thing
// is breaking. Initialising the exists, so that the program wwill record true or false each time the element is 
// same as the user input then we call the true since it is the true one\.

import java.util.Scanner;

public class array {

    public static void courses(){
        String[]  subjects = {"intro to cs","french","calculus","research"};
        System.out.print("Search a course :");
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean exists = true;

        for (int i = 0;i < subjects.length;i++){
            if (name.equals(subjects[i])){
                exists = true;
                break;
            }
        }
        if(exists){
            System.out.println("The course " +name+ " is found");
        }else{
            System.out.println("The course " +name+ " is not found");
        }
    }
    public static void main(String[] args) {
        courses();
    }
    
}
