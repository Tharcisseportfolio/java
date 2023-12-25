// fibonnaci sequences

public class recursion {
    public static int recursive(int n){
        if (n <=1){
            return n;

        }else{
            // System.out.println(n);
            return recursive(n - 1) + recursive(n -2);
        }

    }
    public static void main(String[] args) {
        // recursive(5);
        System.out.println(recursive(5));  
    }
    
}
