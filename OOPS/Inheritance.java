

public class Inheritance {
    public static void main(String args[]){
        Fish fs = new Fish();
        fs.eat();
        fs.color="red";
        System.out.println(fs.color);
    }
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    };

}
class Fish extends Animal{  
    void swim(){
        System.out.println("Swim") ;
    }
}

