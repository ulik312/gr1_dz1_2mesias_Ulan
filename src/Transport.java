public class Transport {
    private Colors color;
    private String name;
    private String type;

    private zavod zavod;


    public Colors getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Transport(Colors color, String name, String type,zavod zavod) {
        this.color = color;
        this.name = name;
        this.type = type;
        this.zavod = zavod;
    }

    public String getInfo(){
        return "Name: " + getName()+
                "\nType: " + getType()+
                "\nColor: " + getColor()+
                "\nCountry: " + zavod.getCountry()+
                "\nYear: " + zavod.getWhen();
    }

    public String transport(String type){
        return type;
    }
}