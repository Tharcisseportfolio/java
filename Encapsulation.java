public class Encapsulation {
    private String name;

    public String getName(){
        return name;
    }
    public String setName(String newname){
        this.name = newname; 
        return name;
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        if(person.getName() ==null){
            System.out.println("There is no name given");
        }else{
            System.out.println("The name is " + person.getName());
        System.out.println(person.setName("Burundi"));}
    }

}
