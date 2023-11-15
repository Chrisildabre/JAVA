public class vehicle{
    private String name;
    private int currentspeed;
    private int currentdirection;


    public vehicle(String name){
        this.name=name;
        this.currentdirection=0;
        this.currentspeed=0;
    }

    public void steer(int direction){
        this.currentdirection+=direction;
        System.out.println("Steer method called: Steering is at "+ currentdirection+ " degrees");
    }

    public void move(int speed, int direction){
        currentspeed=speed;
        currentdirection=direction;
        System.out.println("move method called: moving at "+ currentspeed+ " at "+currentdirection+ " degrees");
    }
    public void stop(){
        System.out.println("The vehicle is stopped.");
        this.currentspeed=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void setCurrentdirection(int currentdirection) {
        this.currentdirection = currentdirection;
    }
    
}

