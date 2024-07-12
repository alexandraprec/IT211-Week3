// Define the TrafficLight class

public class TrafficLight {

    // Step 1: Define attributes for color and duration
    private String color;
    private int duration;

    // Step 2: Adding constructors
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Getter method for color
    public String getColor(){
        return color;
    }

    // Getter method for duration
    public int getDuration(){
        return duration;
    }

    // Step 3: Method to change color
    public void changeColor(String newColor){
        this.color = newColor;
    }

    // Step 4: Method to check if the light is red
    public boolean isRed() {
        return this.color.equalsIgnoreCase("red");
    }

    // Step 5: Method to check if the light is green
    public boolean isGreen() {
        return this.color.equalsIgnoreCase("green");
    }

}
















