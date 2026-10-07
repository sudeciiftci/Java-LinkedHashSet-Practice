import java.util.LinkedHashSet;
import java.util.Scanner;

public class MusicPlaylistManager {

    public static void main(String[] args) {

        int option = 0;

        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> songs = new LinkedHashSet<>();

        while (option != 6) {

            System.out.println("""
                    
                    ===== Music Playlist Manager =====
                    
                    1. Add song
                    2. Remove song
                    3. Check song
                    4. Show playlist
                    5. Show song count
                    6. Exit
                    
                    """);

            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1: {

                    System.out.print("Enter song name: ");
                    String addSong = scanner.nextLine();

                    boolean added = songs.add(addSong);

                    if (added) {
                        System.out.println("Song added successfully.");
                    } else {
                        System.out.println("Song already exists in the playlist.");
                    }

                    break;
                }

                case 2: {

                    System.out.print("Enter song name: ");
                    String removeSong = scanner.nextLine();

                    boolean removed = songs.remove(removeSong);

                    if (removed) {
                        System.out.println("Song removed successfully.");
                    } else {
                        System.out.println("Song not found.");
                    }

                    break;
                }

                case 3: {

                    System.out.print("Enter song name: ");
                    String containsSong = scanner.nextLine();

                    if (songs.contains(containsSong)) {
                        System.out.println("Song is in the playlist.");
                    } else {
                        System.out.println("Song is not in the playlist.");
                    }

                    break;
                }

                case 4: {

                    if (songs.isEmpty()) {
                        System.out.println("Playlist is empty.");
                    } else {

                        System.out.println("Playlist:");

                        for (String song : songs) {
                            System.out.println("- " + song);
                        }
                    }

                    break;
                }

                case 5: {

                    System.out.println("Total songs: " + songs.size());

                    break;
                }

                case 6: {

                    System.out.println("Exiting playlist manager...");

                    break;
                }

                default: {

                    System.out.println("Invalid option. Please choose between 1 and 6.");

                }
            }
        }

        scanner.close();
    }
}