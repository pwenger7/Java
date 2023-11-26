public class Veichle {
       private String Name;
       private int currentSpeed;
       private int currentDirection;


    //constrtuctor
    public Veichle(String name) {
        Name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    //staer
    public void stear(int direction)
    {
        this.currentDirection=direction;
        System.out.println("Stear method is called. Stearing at " + currentDirection + "degrees");
    }

    //move
    public void move(int speed, int direction)
    {
        currentSpeed=speed;
        currentDirection=direction;
        System.out.println("Move method called Moving at " + currentSpeed + "in direction " + currentDirection );
    }


    //getter and setter for private variable and encapsulation
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }


    //stop
    public void stop()
    {
        this.currentSpeed=0;// speed=0 then it means car is stopped
        System.out.println("Veichle is stopped");
    }
    
}