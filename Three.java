public class Three {
    private String message;
    private int count;
    private boolean isActive;

    public Three(String message, int count, boolean isActive) {
        this.message = message;
        this.count = count;
        this.isActive = isActive;
    }

    public void execute(int a, int b) {
        System.out.println("Executing in Class Three");
        System.out.println("Values: " + message + ", " + count + ", " + isActive);
        System.out.println("Calculated value: " + calculate(a, b));
    }

    public int calculate(int x, int y) {
        return count * (x + y);
    }
}
