public class car extends vehicle{
    private int wheels;
    private int doors;
    private String type;
    private int gears;
    private boolean isManual; //if true car is manual orelse automatic.
    private int currentgear;

    public car(String name, int wheels, int doors, String type, int gears, boolean isManual){
        super(name);
        this.type=type;
        this.gears=gears;
        this.doors=doors;
        this.wheels=wheels;
        this.isManual=isManual;
        currentgear=1;
    }
    public void changegear(int newgear){
        this.currentgear=newgear;
        System.out.println("changegear method called: changed to "+ this.currentgear+ " gear");
    }
    public void changespeed(int newspeed,int newdirection){
        move(newspeed,newdirection);
        System.out.println("changespeed method called: changed to "+ newspeed + " direction--> "+ newdirection);
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getGears() {
        return gears;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }
    public boolean isManual() {
        return isManual;
    }
    public void setManual(boolean isManual) {
        this.isManual = isManual;
    }
    public int getCurrentgear() {
        return currentgear;
    }
    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
    }
    
} 