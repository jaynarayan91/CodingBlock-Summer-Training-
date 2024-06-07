package Day14.OOpsConcept;

public class Student {
    String name;
    int ID;
    int age;
    char section;
    String branch;

    void introduceYourself(){
        System.out.println("Hi my name is: " + name + "\nMy ID is: " + ID + 
        "\nMy Major is : " + branch + "\nOf Section : " + section + "\nMy age is: " +age);
    }

    // Default Constructor
    public Student(){

    }

    // New Constructor 
    public Student(String name, int age, int ID, char section, String branch) throws Exception{
        this.name = name;
        if(age>17){
            this.age = age;
        }else{
            throw new Exception("Wrong Input");
        }
        this.ID = ID;
        this.section = section;
        this.branch = branch;

    }

    // Static is keyboard that will always call first when the class is created!
    // static{
    //     System.out.println("This is Student static");
    // }

}
