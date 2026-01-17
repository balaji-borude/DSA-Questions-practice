

public class Constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student("Balaji");
        

    }


}

class Student{
    String name;
    int marks;

    // Non-parameterized constructor 
    Student(){
        System.out.println("constructor is called....");
    }

    // parameterized constructor 
    Student(String name){
        System.out.println("Constructor is called ");
         this.name = name; // assign name to the studnet name 
    }
}