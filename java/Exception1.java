public class Exception1 {
    private String message = "Error occurs";

    Exception1(){
        this.message = "Error not occurs";
    }
    public String getMessage(){
        return message;
    }
    
}
