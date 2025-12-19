import java.util.HashSet;
import java.util.Set;

public class demoSet {
    public static void main(String[] args){
        Set<Integer> number1 = new HashSet<>();
        number1.add(1);
        number1.add(2);
        number1.add(12);
        number1.add(23);
        number1.add(14);
        number1.add(25);

        System.out.println(number1.size());


        number1.remove(25);
        number1.remove(25);

        System.out.println(number1.contains(23));
        System.out.println(number1.contains(25));

        System.out.println(number1);



    }
    
}
