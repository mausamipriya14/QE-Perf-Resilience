public class CustomException1 extends Exception1 {
    @Override
    public String getMessage(){
        return super.getMessage();
    }
    public static void main(String[] args){
        CustomException1 obj = new CustomException1();
        System.out.println(obj.getMessage());

    }
    
}
