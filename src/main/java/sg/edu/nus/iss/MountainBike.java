package sg.edu.nus.iss;

public class MountainBike extends Bicycle {
    
    public int seatHeight;

    

    

    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
        //seatHeight refers to the function attribute/value, whatever you pass in the parameter refers to seatHeight at the bottom line
        //this.seatHeight refers to the class level attribute
    
    }

    public int getSeatHeight() {
        return seatHeight;

    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;

    }

    @Override
    public String toString() {
        return "MountainBike [seatHeight=" + seatHeight + "]";
        //or alternatively,
        //return super.toString() + "\nSeat Height=" + seatHeight;

    }

    

}
