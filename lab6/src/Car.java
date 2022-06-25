public class Car {

    private String color;
    private boolean hasFourWheelDrive;
    private int lengthOfCarInInches;

    public Car(String color, boolean hasFourWheelDrive, int lengthOfCarInInches){
        this.color = color;
        this.hasFourWheelDrive = hasFourWheelDrive;
        this.lengthOfCarInInches = lengthOfCarInInches;
    }

    public void setColor(String new_color){
        this.color = new_color;
    }

    public String getColor(){
        return this.color;
    }

    public void setHasFourWheelDrive(boolean hasFourWheelDrive){
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public boolean getHasFourWheelDrive(){
        return this.hasFourWheelDrive;
    }

    public void setLengthOfCarInInches(int carInInches){
        this.lengthOfCarInInches = carInInches;
    }

    public int getLengthOfCarInInches(){
        return this.lengthOfCarInInches;
    }
}
