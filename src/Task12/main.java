package Task12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MusicContainer library = new MusicContainer("Музыкальная библиотека");

        while (true) {
            System.out.println("\n1. Создать альбом ");
            System.out.println("2. Создать плейлист");
            System.out.println("3. Добавить трек в библиотеку");
            System.out.println("4. Включить");
            System.out.println("5. Закрыть");
            System.out.print("Что вы хотите сделать?: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Имя альбома: ");
                    String albumName = scanner.nextLine();
                    MusicContainer album = new MusicContainer(albumName);
                    addTracksOrContainers(scanner, album);
                    library.add(album);
                    break;

                case 2:
                    System.out.print("Имя плейлиста: ");
                    String playlistName = scanner.nextLine();
                    MusicContainer playlist = new MusicContainer(playlistName);
                    addTracksOrContainers(scanner, playlist);
                    library.add(playlist);
                    break;

                case 3:
                    System.out.print("Название трека: ");
                    String trackName = scanner.nextLine();
                    library.add(new Track(trackName));
                    break;

                case 4:
                    System.out.println("\nВключить:");
                    library.play();
                    break;

                case 5:
                    System.out.println("Выход");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }


    private static void addTracksOrContainers(Scanner scanner, MusicContainer container) {
        while (true) {
            System.out.println("\n1. Добавить трек");
            System.out.println("2. Добавить альбом/плейлист");
            System.out.println("3. Готово");
            System.out.print("Что вы хотите сделать?: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название трека: ");
                    String trackName = scanner.nextLine();
                    container.add(new Track(trackName));
                    break;

                case 2:
                    System.out.print("Введите название альбома/плейлиста: ");
                    String nestedName = scanner.nextLine();
                    MusicContainer nestedContainer = new MusicContainer(nestedName);
                    addTracksOrContainers(scanner, nestedContainer);
                    container.add(nestedContainer);
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Неверный выбор.Попробуйте снова.");
            }
        }
    }
}
