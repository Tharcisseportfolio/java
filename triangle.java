import java.util.Scanner;

public class triangle {

    public static void drawShape() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" The length of the triangle: ");
        int tLength = scanner.nextInt();

        
        for (int i = 0; i < tLength;i++){
            // System.out.println("The value of i " + i );
        
            for(int j = 0;j < i;j++){
                System.out.print("🎟️"+ j + "🎟️");

            }System.out.println("🎟️"+ i + "🎟️");
            }
        }   
  
    public static void main(String[] args) {
        drawShape();
        
    }
    
}
