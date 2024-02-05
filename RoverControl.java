public class RoverControl {

    private int x;
    private int y;
    private String direction;

    public RoverControl(int initialX, int initialY, String initialDirection) {
        this.x = initialX;
        this.y = initialY;
        this.direction = initialDirection.toUpperCase(); // Assuming direction is provided in uppercase
    }

    public void moveForward() {
        switch (direction) {
            case "NORTH":
                y++;
                break;
            case "EAST":
                x++;
                break;
            case "SOUTH":
                y--;
                break;
            case "WEST":
                x--;
                break;
            default:
                System.out.println("Invalid direction.");
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "NORTH":
                direction = "WEST";
                break;
            case "EAST":
                direction = "NORTH";
                break;
            case "SOUTH":
                direction = "EAST";
                break;
            case "WEST":
                direction = "SOUTH";
                break;
            default:
                System.out.println("Invalid direction.");
        }
    }

    public void turnRight() {
        switch (direction) {
            case "NORTH":
                direction = "EAST";
                break;
            case "EAST":
                direction = "SOUTH";
                break;
            case "SOUTH":
                direction = "WEST";
                break;
            case "WEST":
                direction = "NORTH";
                break;
            default:
                System.out.println("Invalid direction.");
        }
    }

    public void printPosition() {
        System.out.println("Current Position: (" + x + ", " + y + "), Direction: " + direction);
    }

    public static void main(String[] args) {
        // Create a new rover at position (0, 0) facing NORTH
        RoverControl rover = new RoverControl(0, 0, "NORTH");

        // Move the rover
        rover.moveForward();
        rover.turnRight();
        rover.moveForward();
        rover.turnLeft();
        rover.moveForward();

        // Print the final position
        rover.printPosition();
    }
}
