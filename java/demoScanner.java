import java.util.Scanner;
class demoScanner {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter username");

        // Read user input
        String userName = obj1.nextLine();
        // Output user input
        System.out.println("Username is: " + userName);

        obj1.close();
    }
}
    
    

