
final public class machines extends Moto{
    private int capacity;

    public machines(String name, String type, zavod zavod,
                    Colors color, int length, int speed, int capacity) {
        super(name,color , type, zavod, length, speed);
        this.capacity = capacity;
    }
    public machines(String name, String type, zavod zavod,
                    Colors color, int length, int speed) {
        super(name,color , type, zavod, length, speed);

    }

    public int getCapacity() {
        return capacity;
    }

    public String getInfo(){
        if (capacity!= 0) {
            return super.getInfo() +
                    "\nCapacity: " + capacity;
        }else {
            return super.getInfo();
        }
    }

}