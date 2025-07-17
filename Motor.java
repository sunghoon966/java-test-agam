public class Motor{
    private double location;
    private final int port;

    public Motor(double location, int port){
        this.location = location;
        this.port = port;
    }

    public void setLocation(double location){
        if (location < 0){
            this.location = 0;
        }
        else if (location > 1){
            this.location = 1;
        }
        else{
            this.location = location;
        }
    }

    public double getLocationAsDegrees(){
        return this.location * 360;
    }

    @Override
    public String toString(){
        return "port " + this.port + " location: " + this.getLocationAsDegrees();
    }

    public int getPort(){
        return this.port;
    }

    public double getLocation(){
        return this.location;
    }


}
