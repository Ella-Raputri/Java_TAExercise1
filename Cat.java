public class Cat extends Animal{
    public Cat(double weight1) {
        super("cat", 4, weight1, "walking");
    }
    public void animalSound(){
        System.out.println("meow meow");
    }

    public void moving(){
        System.out.println("The cat is " + getMove_method());
    }
}
