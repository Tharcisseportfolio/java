import java.util.Scanner;

public class bricks {

    public static void drawShape() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" The length of the triangle: ");
        int tLength = scanner.nextInt();

        
        for (int i = 0; i < tLength;i++){
            // System.out.println("The value of i " + i );
            
            if ( i < 2 || i >= tLength-2){
                for(int j = 0;j < tLength;j++){
                System.out.print("🎟️"+ j + "🎟️");
                }

            }System.out.println("🎟️"+ i + "🎟️");
            }
        }   

        
    public static void main(String[] args) {
        drawShape();
        
    }
    
}

