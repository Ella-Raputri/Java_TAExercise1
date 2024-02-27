public class Bird extends Animal{
    public Bird(double weight1) {
        super("bird", 2, weight1, "flying");
    }
    public void animalSound(){
        System.out.println("chirp chirp");
    }
    public void moving(){
        System.out.println("The bird is " + getMove_method());
    }
}
