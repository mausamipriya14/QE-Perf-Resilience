class Boy extends Human {
    //Overriding method
    int age = 10;
    public void eat() {
        System.out.println("Boy is eating");
    }
    
    public static void main( String args[]) {
        Human obj = new Boy();
        Boy obj1 = new Boy();
        //This will call the child class version of eat()
        obj.eat();
        obj1.eat();
        System.out.println(Human.age);
        System.out.println(obj1.age);
        System.out.println(Human.age+obj1.age);
    }
}
