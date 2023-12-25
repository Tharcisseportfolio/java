// fibonnaci sequences

public class recursion {
    public static long recursive(int n){
        if (n <= 1){
            return n;
        }
        else{
            return recursive(n - 1) + recursive(n - 2 );
        }
        
    }
    public static void main(String[] args) {
        // recursive(5);
        System.out.println(recursive(50));    
    }
    
}
