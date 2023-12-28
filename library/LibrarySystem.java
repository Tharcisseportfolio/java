import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<String> borrowed = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void borrow(String bookName) {
        borrowed.add(bookName);
    }

    public void giveBack(String bookName) {
        borrowed.remove(bookName);
    }
    public List<String> getborrowed(){
        return borrowed;
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        for (int i = 0;i < 10; i ++){
            System.out.print(" Enter name of book : ");
            String bookName = library.scanner.nextLine();
            if(bookName.equals("q")){
                break;
            }else{
                library.borrow(bookName);
            }
            
        }

        for (int i = 0;i < 10; i ++){
            System.out.print(" Enter name of book u return : ");
            String bookName = library.scanner.nextLine();
            if(bookName.equals("q")){
                break;
            }else{
                library.giveBack(bookName);
            }
            
        }

        // library.giveBack(bookName);
        List<String> borrowedbooks = library.getborrowed();
        System.out.println("The borrowed books are " + borrowedbooks);
    }
}