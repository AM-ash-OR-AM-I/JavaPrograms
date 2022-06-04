class Fan{
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn(){
        return on;
    }


}

public class CreateFan {
    public static void main(String[] args) {
        Fan orient = new Fan();
        orient.setSpeed(orient.FAST);
        orient.setColor("Red");
        System.out.println(orient.getColor());
        System.out.println(orient.getSpeed());
    }
    
}
