package Task5;

public class Client {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        Observer firstSubscriber = new Subsciber("Анастасия");
        Observer secondSubscriber = new Subsciber("Роман");
        Observer thirdSubscriber = new Subsciber("Татьяна");

        calendar.addObserver(firstSubscriber);
        calendar.addObserver(secondSubscriber);
        calendar.addObserver(thirdSubscriber);

        calendar.addEvent("Совещание с коллегами в 10:00");

        calendar.removeObserver(secondSubscriber);

        calendar.addEvent("Тренировка в зале в 18:00");






    }
}
