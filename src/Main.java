public class Main {
    public static void main(String[] args) {
        zavod zavod = new zavod("BISH",1999);

        Moto object_1 = new Moto("moto",Colors.PINK, "Ride",zavod,80,250);
        System.out.println(object_1.getInfo());
        System.out.println(object_1.transport());
        System.out.println(object_1.transport("Standard"));

        System.out.println("_________________________________");


        machines object_2 = new machines("Chui","ride",zavod, Colors.MILITARY,30,240, 90);
        System.out.println(object_2.getInfo());
        System.out.println(object_2.transport());
        System.out.println(object_2.transport("Military"));

        System.out.println("_______________________________");


        Moto object_3 = new Moto("Talas", Colors.BLUE, "ride", zavod, 40, 110);
        System.out.println(object_3.getInfo());
        System.out.println(object_3.transport());
        System.out.println(object_3.transport("Standard"));
    }
}