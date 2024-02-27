public class Main {
    public static void main(String[] args) {
        //Cat class
        Cat my_cat = new Cat(8.2);
        System.out.println("Name: " + my_cat.getName() + ", Weight: "+ my_cat.getWeight());
        System.out.println("Total legs: " + my_cat.getTotal_legs() + ", Movement: " + my_cat.getMove_method());

        my_cat.setName("orange cat");
        my_cat.setTotal_legs(4);
        my_cat.setWeight(7.2);
        my_cat.setMove_method("running");
        System.out.println("\nName: " + my_cat.getName() + ", Weight: "+ my_cat.getWeight());
        System.out.println("Total legs: " + my_cat.getTotal_legs() + ", Movement: " + my_cat.getMove_method());

        System.out.println();
        my_cat.moving();
        my_cat.animalSound();

        System.out.println("==================================================");
        //Bird class
        Bird my_bird = new Bird (2.1);
        System.out.println("Name: " + my_bird.getName() + ", Weight: "+ my_bird.getWeight());
        System.out.println("Total legs: " + my_bird.getTotal_legs() + ", Movement: " + my_bird.getMove_method());

        my_bird.setName("parrot");
        my_bird.setTotal_legs(2);
        my_bird.setWeight(2.8);
        my_bird.setMove_method("flapping wings");
        System.out.println("\nName: " + my_bird.getName() + ", Weight: "+ my_bird.getWeight());
        System.out.println("Total legs: " + my_bird.getTotal_legs() + ", Movement: " + my_bird.getMove_method());

        System.out.println();
        my_bird.moving();
        my_bird.animalSound();

    }
}