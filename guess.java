import java.util.Random;
import java.util.Scanner;
public class guess {

    public static void numberGuess(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many trial to gusess :");

        int range = scanner.nextInt();

        for( int i = 0 ; i < range; i++){
            System.out.println("CHoose :");

            int number = scanner.nextInt();
            int randomint = random.nextInt(range);
 
            if(number == randomint){
                System.out.println("You won");
            }else{
                System.out.println("Wrong guess");
            }
        }
        
    }
    public static void main(String[] args) {
        numberGuess();
        
    }
    
}
