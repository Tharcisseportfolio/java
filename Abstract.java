abstract class Abstract {
    public String firstName = "Tharcisse";
    public int age = 21;
    public String universityName = "Oberlin college";  
    
}

class Person extends Abstract{
    public int graduationYear = 2027;
    public void study(){
        System.out.println("This is the body of the abstract class");

        
    }

}

