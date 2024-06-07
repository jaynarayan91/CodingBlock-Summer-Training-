package Day14.OOpsConcept;

public class Classroom {
    public static void main(String[] args) throws Exception {
        
    
    // Student jay = new Student();
    // jay.name = "JAY NARAYAN";
    // jay.ID = 91;
    // jay.section = 'B';
    // jay.branch = "CSE";
    // jay.introduceYourself();


    // Object Creation by new Constructor calling;
    Student jay = new Student("Jay Narayan",21, 91, 'B', "CSE");
    jay.introduceYourself();

    }
}
