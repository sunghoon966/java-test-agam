public class Motor{
    double location;
    final int port = 1;
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
        return "port"+this.port+"\nlocation: "+this.getLocationAsDegrees();
    } 


}
