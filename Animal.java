public abstract class Animal {
    private String name;
    private int total_legs;
    private double weight;
    private String move_method;

    public Animal (String name1, int total_legs1, double weight1, String move_method1){
        this.name = name1;
        this.total_legs = total_legs1;
        this.weight = weight1;
        this.move_method = move_method1;
    }

    public abstract void moving();
    public abstract void animalSound();

    //getters
    public String getName() {
        return this.name;
    }
    public int getTotal_legs() {
        return this.total_legs;
    }
    public double getWeight() {
        return this.weight;
    }
    public String getMove_method() {
        return this.move_method;
    }

    //setters
    public void setName(String name2){
        this.name = name2;
    }
    public void setTotal_legs(int total_legs2) {
        this.total_legs = total_legs2;
    }
    public void setWeight(double weight2) {
        this.weight = weight2;
    }
    public void setMove_method(String move_method2) {
        this.move_method = move_method2;
    }
}
