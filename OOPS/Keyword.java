public class Keyword {
    public static void main(String[] args) {
        
    // 1. static keywords 
        Student s1 = new Student();

        // Set static property using class name --> Correct way to define the Static Propertis 
        Student.SchoolName = "CTMK School";

        s1.setName("Balaji");
        System.out.println(s1.getName());
        
        // apan kontya pn object madhe schoolName define kele ki te sarv object la use hote 
        Student s2 = new Student();
        s2.SchoolName = "CTMK school";

        // check kara 
        Student s3 = new Student();
        System.out.println(s3.SchoolName);  // s3 and s1 donhi object madhe schoolname ekach ale 
        System.out.println(s1.SchoolName);

        //2. Static function 
            // -- our main function is static which means --> we cannot re-defiene it with main name 
            // the value of the static main function is remain same 

    
    // Super Keywords

        Horse h = new Horse();
         // jari apan Horse cha object create kela tari aple Animal and Horse cha donhi constructore called zale hech apan -->  Super Keyword ne pn karu shaktoo
         // super keyword ne immediate partent chi Propety pn change karu shakto 
        

         System.out.println(h.color);  //horse chya constructor madhe color property send keli 
    }
}


class Student{
    int rollNumber;
    String Name;

    static String SchoolName;  // school name la Static thevle 

    void setName (String studentName){
        this.Name = studentName;
    }

    String getName (){
        return this.Name;
    }
}


// Super Keywords

class Animal {
    String color;
    Animal(){
        System.out.println("Animal contructor is called ");
    }
}

class Horse extends Animal{
    
    Horse(){
        super.color = "red";
        System.out.println("Horse Constructor is called ");
    };
}