package Day15.ExceptionHandling;

public class ExceptionHandling {
    String name;
    int ID;
    int age;
    char section;
    String branch;

    void introduceYourself(){
        System.out.println("Hi my name is: " + name + "\nMy ID is: " + ID + 
        "\nMy Major is : " + branch + "\nOf Section : " + section + "\nMy age is: " +age);
        }

         // New Constructor 
    public ExceptionHandling(String name, int age, int ID, char section, String branch) throws Exception{
        this.name = name;
        try{
            if(age>17){
            this.age = age;
        }else{
            throw new Exception("Wrong Input");
        }
    }catch(Exception e){
        e.printStackTrace();
        // System.exit(0);

    }
        this.ID = ID;
        this.section = section;
        this.branch = branch;

    }
}
