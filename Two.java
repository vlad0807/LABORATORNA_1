public class Two {
    private double height;
    private String color;
    private boolean isAvailable;

    public Two(double height, String color, boolean isAvailable) {
        this.height = height;
        this.color = color;
        this.isAvailable = isAvailable;
    }

    public void performAction(int y) {
        System.out.println("Performing an action in Class Two");
        System.out.println("Values: " + height + ", " + color + ", " + isAvailable);
        System.out.println("Calculated value: " + calculate(y));
    }

    public double calculate(double z) {
        return height * z;
    }
}