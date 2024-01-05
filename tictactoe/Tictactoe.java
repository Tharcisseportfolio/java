import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tictactoe {

    protected List<String> board;
    protected String playerLetter;

    public Tictactoe( ArrayList<String> board){
        this.board = board;
    }


    public ArrayList<String> constantBoard(ArrayList<String> board){
        for(int i = 0;i<9;i++){
            board.add("   -   ");
        }
        return board;
    }
    public ArrayList<String> formatBoard(ArrayList<String> board){
        for(int i = 0;i<board.size();i++){
            if(i > 0 && i % 3 == 0){
                System.out.println();
                System.out.println();
            }
            System.out.print("|" + board.get(i));
        }
        System.out.println();
        System.out.println(board);
        return board;
    }



    public void checkRows(ArrayList<String> board){
            HashSet<String> firstRow = new HashSet<>(board.subList(0, 3));
            HashSet<String> secondRow = new HashSet<>(board.subList(3, 6));
            HashSet<String> thirdRow = new HashSet<>(board.subList(6, 9));

            System.out.println(firstRow + " "+ " " + secondRow + " " +  thirdRow);
        }


    public ArrayList<String> GetPlayerTurn(String playerLetter,ArrayList<String> board,Scanner positionInput){
        
        boolean running = true; // the system is in running state

        while(running == true){
            System.out.print("Enter your name: ");
            System.out.print("Enter position(1-9): ");
            int positionPlayer = positionInput.nextInt();
            
            if (playerLetter == "  o  "){
                playerLetter = "  x  ";
                // System.out.println("letter :" + playerLetter + " position :" + positionPlayer);
            }else{
                playerLetter = "  o  ";
                // System.out.println("letter :" + playerLetter + " position :" + positionPlayer);
 
            }
            board.set(positionPlayer - 1," "+playerLetter + " "); //update the position value
            formatBoard(board); // display the board in 2D
        }
        return board;

    }
    public static void main(String[] args){
        ArrayList<String> board = new ArrayList<>();
        Tictactoe boardConst = new Tictactoe(board);
        Scanner playerInput = new Scanner(System.in);

        String playerLetter = "  o  ";
        // CheckWinner checkWinner = new CheckWinner();
        
        ArrayList<String> emptyList = boardConst.constantBoard(board);
        ArrayList<String> activeBoard = boardConst.formatBoard(emptyList);
        ArrayList<String> filledBoard = boardConst.GetPlayerTurn(playerLetter,activeBoard,playerInput);
        System.out.println("active " + activeBoard);

        System.out.println(boardConst.formatBoard(filledBoard));
        
    }
}
