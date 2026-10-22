package Basic;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class CollectionFramework {
    
    // implmenting the hashet 
    public static Set<Integer> removeDuplicate(int arr[]){
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }
        return set;
    }


    public static void main(String[] args) {

        int arr[]={1,2,4,5,6,5,5,4,3,2,9,7};
        Set<Integer> result = removeDuplicate(arr);
        System.out.println(result);

        
        // System.out.println("We are Learning the Collection Framework here ");

        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // System.out.println(list);

        // list.removeAll(list);
        list.clear();  //  This remove more Efficienntly than the removeAll function 

        // System.out.println(list);

        // create the arrayList of the String
        ArrayList <String> str = new ArrayList<>();
        
        str.add("Balaji");
        str.add("patil");
        str.add("batman");

        // System.out.println(str);


        // System.out.println(str.contains("Balaji"));


        // we can use Var keyword in hava from java 10 
        var cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Maruti");
        cars.add("Suzuki");

        // for(int i=0; i<cars.size(); i++){
        //     System.out.println(cars.get(i));
        // };
        
        // Print cars arrayList
        // System.out.println(cars);

        // get arrylist element by its index
        cars.get(2);
        // System.out.println(cars.size());
        
        // addAll()--> add all element of one list to another list
        ArrayList<String> gernamBrand = new ArrayList<>();
        gernamBrand.add("skoda");
        gernamBrand.add("Vovlswogen");
        gernamBrand.add("kaylaq");
        cars.addAll(gernamBrand);
        // System.out.println("priint gernam Brand cars "+ gernamBrand);
        // System.out.println("Print cars arraylist after adding with cars "+cars);
        
        // sort() --> sort arraylist in ascendiing Order
        Collections.sort(gernamBrand,String.CASE_INSENSITIVE_ORDER);
        // System.out.println("Printing the gernamBrand after sorting " + gernamBrand);

        // get the size of the arraylist
        // System.out.println("Size of german brand "+gernamBrand.size());

        // Clone() --> create a new arraylist with same element and size capacity 
        ArrayList<String> IndianCars = new ArrayList<>();

        // IndianCars=(ArrayList<String>)gernamBrand.clone();

      //  System.out.println("Printing size of indian cars "+ IndianCars.size());
        // System.out.println(IndianCars);

        // contain() ---> search element from arrayList
        // System.out.println(IndianCars.contains("kaylaq"));

        // ensureCapacity()  --> specifies the total elements an arraylist contains

        IndianCars.ensureCapacity(400); // Mhanje itki min capacity rahil ya ArrayList chi 

        // isEmpty() --> Check if arraylist id empty 
        // System.out.println(IndianCars.isEmpty());

        // indexOf() --> searches a specified element of an arraylist and return the index of arrayList 
        // int indexOfelement = gernamBrand.indexOf("kaylaq");
        // System.out.println("index of element is  "+ indexOfelement);
        
        //---------------------------LINKED LIST ----------------------------------
        
        // create the linked list 
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(500);
        numbers.add(60);

        // System.out.println(numbers);

        // user itertor operator 
        // Iterator <Integer>  iterator = numbers.iterator();
        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        //  queue  collection framework 

        Queue<Number> queue = new ArrayDeque<>();

        queue.offer(20); // in Offer() we dont need to handle exception manually it return false when element is not inserted
        queue.add(30); // add() method we have to handle exception handling manually 
        queue.offer(50); 
        queue.offer(80);

        // System.out.println(queue);
        
        // queue.peek(); method return the head of the stack 
        // System.out.println(queue.peek());

        // queue.poll() --> Return and remove the head of queue
        queue.poll();
        // System.out.println(queue);
        //   queue.remove()--> return and remove the head of queue --> throw an exception if queue is emppty 

        Queue<Number> queue2 = new ArrayDeque<>();
        // System.out.println(queue2.remove());
    }   


}
