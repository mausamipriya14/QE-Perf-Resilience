import java.util.Random;
public class Test {
    public static void main(String[] args){
        Random rndm = new Random();
        int cnt = 0;
        int limit = rndm.nextInt(5);
        for(int i=0;i<=limit;i++){
           new Boy();
           new Girl();
           cnt++;
        }
        // Human1 obj1 = new Human1();
        // obj1.displayHuman();
        
        // Boy1 obj2 = new Boy1();
        // obj2.displayBoy1();

        // Girl obj3 = new Girl();
        // obj3.displayGirl();

        // Robot obj4 = new Robot();
        // obj4.displayRobot();

        // System.out.println("Population:" + Human.population);

        // Random rndm = new Random();

        // obj1.showPopulation(rndm.nextInt(5));
        
        Human1 h1 = new Human1();
        h1.displayHuman();
        System.out.println(Human1.population);
        
    }
    
}
