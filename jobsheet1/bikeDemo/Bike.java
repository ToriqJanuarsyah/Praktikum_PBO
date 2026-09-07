package bikeDemo;

public class Bike{
    private String brand;
    private int speed;
    private int gear=1;

    //Gear 1 : max 5 km/h, Gear 2 : max 10 km/h, ... gear 6: max 60 km/h 
    private final int[] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60};
    public void setBrand(String brandname){
        this.brand = brandname;
    }

    public void gearChanges(int gearValue){
        if(gearValue < 1 || gearValue > 6){
            System.out.println("Invalid gear value. Please select a gear between 1 and 6.");
            return;
        }
        this.gear = gearValue;
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement){
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}