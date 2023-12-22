public class Main {
    public static void main(String[] args) {
        One one = new One(5, 10.5, "Object One");
        Two two = new Two(7.8, "Blue", true);
        Three three = new Three("Hello", 3, false);

        one.doSomething();
        System.out.println("Calculated value: " + one.calculate(3));

        two.performAction(4);
        System.out.println("Calculated value: " + two.calculate(2.5));

        three.execute(2, 5);
        System.out.println("Calculated value: " + three.calculate(3, 4));
    }
}