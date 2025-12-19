import java.util.HashSet;
import java.util.Set;
import java.util.Iterator; 

public class demoSetIterator {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
// Add values to it
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");
        
        Iterator<String> iterator = names.iterator();

        // Use it to loop through the HashSet
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
    
}
