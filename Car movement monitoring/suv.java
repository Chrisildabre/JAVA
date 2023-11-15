public class suv extends car{

    public suv(String name, int wheels, int doors, String type, int gears, boolean isManual) {
        
        super(name, 4, 5, "suv", 6, isManual);
    
    }
    public void accelerate(int rate){
        int newspeed = getCurrentspeed()+rate;

        if(newspeed==0){
            stop();
            changegear(1);
        }
        else if(newspeed>=0 && 20>newspeed ){
            changegear(1);
        }
        else if(newspeed>=20 && 40>newspeed ){
            changegear(2);
        }
        else if(newspeed>=40 && 60>newspeed ){
            changegear(3);
        }
        else if(newspeed>=60 && 80>=newspeed ){
            changegear(4);
        }
        else{
            changegear(5);
        }

        if(newspeed>0){
            changespeed(newspeed, getCurrentdirection());
        }
    }
    
}
