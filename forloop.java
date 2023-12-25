// using for reach looping technique: for then what value then the iterative  things.

public class forloop{
    public  static void  main(String[] argv){
        String[] cars = {"volvo","honda","rambogini"};
        int[] numbers = {1,2,3,4};

        //  try to use the. for each for loop to uterate through the array.
        for(String i : cars){
            System.out.println(i);
        }

        for(int i : numbers){
            System.out.println(i);
        }



        // using the standard for loop to print out the same things.
        System.out.println("The same output using standard for loops");
        int i;

        for (i = 0;i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("The putput for the cars using th standard for loop");
        for (i = 0;i < cars.length; i++){
            System.out.println(cars[i]);
        }


    }
}


