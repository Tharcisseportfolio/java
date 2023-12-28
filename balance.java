public class balance {
    private int balance;

    public balance (int initialbalance){
         balance = initialbalance;
    }
    public static void main(String[] args) {
        balance bank = new balance(100); 
        System.out.println(bank.balance);   
    }
}