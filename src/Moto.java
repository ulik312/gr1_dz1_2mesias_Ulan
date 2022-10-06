public class Moto extends Transport{
    private int length;
    private int speed;

    public Moto (String name, Colors color, String type, zavod zavod, int length, int speed) {
        super(color, name, type, zavod);
        this.length = length;
        this.speed = speed;
    }


    public String transport(String type){
        return type;
    }
    final public String transport(){
        return "moto";
    }


    public int getSpeed() {
        return speed;
    }

    public int getLength() {
        return length;
    }
    public String getInfo() {
        return super.getInfo() +
                "\nLength: " + length + "m" +
                "\nSpeed: " + speed + "km/h";
    }

}