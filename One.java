public class One {
    private int number;
    private double value;
    private String name;

    public One(int number, double value, String name) {
        this.number = number;
        this.value = value;
        this.name = name;
    }

    public void doSomething() {
        System.out.println("Doing something in Class One");
        System.out.println("Values: " + number + ", " + value + ", " + name);
    }

    public int calculate(int x) {
        return number * x;
    }
}