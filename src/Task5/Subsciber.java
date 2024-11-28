package Task5;

public class Subsciber implements Observer{
    String name;
    public Subsciber(String name){
        this.name = name;
    }

    @Override
    public void updateEvent(String event) {
        System.out.println(name + ", новое предстоящее событие для вас: " + event + "!\n");
    }
}
