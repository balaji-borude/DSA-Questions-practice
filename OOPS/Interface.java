// Learning Interface here 
public class Interface {
    
    public static void main(String[] args) {
        Queen ob = new Queen();  // create the object of the queen class not interface 
        ob.moves();


        // applying Mutiple inheritance 
        Tiger obj = new Tiger();
        obj.eat();
        obj.teeth();
        obj.walk();

        // create another clas like deer which is herbivorours and implemetn the multiple inheritance 
    }
}

// create the Interface of the chessPlayer 
// Interface --> is the BluePrint of the class --> Queen and Rook(hati in chess)
// Interfaces are Without Implementations just define the blueprint of the classes s
interface chessPlayer {
    void moves();
    // in Interface  all methods are public , abstract and without Implementation by DEFAULT
    
};

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left , Diagonal ");
    }
};
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left ");
    }
}


// Implement the multiple Inheritance using the Interface 
interface Herbivore{
    void eat();
    void teeth();
}
interface Carnivore{
    void eat();
    void walk();
}


// Multiple inheritance

//A tiger is not a herbivore. That’s like saying a Ferrari runs on diesel and electricity at the same time. It compiles, but it lies.

class Tiger implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Tigear eat only meat");
    }
    public void teeth(){
        System.out.println("Tiger have canine");
    }
    public void walk(){
        System.out.println("Tiger walks in 4 legs ");
    }
}