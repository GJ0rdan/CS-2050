// Garret Jordan
import java.util.InputMismatchException;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        String userTitle, userGenre, userArtist;
        int userNumOfSongs;

        Scanner input = new Scanner (System.in);
        Album standardAlbum = new Album("Renaissance", "Beyonce", "easy listening", 10);

        Album customAlbum = new Album();
        System.out.println("Hello, welcome to Album Editor!");

        int maxNum = 3;
        int num = 0;

        while(num < maxNum)
        {
            System.out.println("Please enter title for album " + (num + 1) + ":");
            userTitle = input.nextLine();
            standardAlbum.setTitle(userTitle);

            System.out.println("Please enter artist for album "+ (num+1)+ ":");
            userArtist = input.nextLine();
            standardAlbum.setArtist(userArtist);

            while (true) {
                System.out.print("Please enter one of the select Genre's for album " + (num + 1) + " (hip-hop, easy listening, orchestral ,your parents, theatre):");
                userGenre = input.nextLine();

                    if (userGenre.equalsIgnoreCase("hip-hop") || userGenre.equalsIgnoreCase("easy listening") || userGenre.equalsIgnoreCase("orchestral") || userGenre.equalsIgnoreCase("your parents") || userGenre.equalsIgnoreCase("theatre")) {
                        standardAlbum.setGenre(userGenre);
                        break;
                    } else {
                        System.out.println("Please enter a valid genre.");
                    }
                }

            try {
                System.out.println("Please enter the number of songs in album " + (num + 1) + ":");
                userNumOfSongs = input.nextInt();
                //input.nextLine();
                standardAlbum.setNumOfSongs(userNumOfSongs);
            }catch(InputMismatchException e){
                System.out.println("Please enter a number");
            }
            input.nextLine();

            System.out.println("Album " +(num+1)+ ": " +"\nTitle: "+standardAlbum.getTitle()+"\nArtist: "+ standardAlbum.getArtist()+"\nGenre: "+ standardAlbum.getGenre()+ "\nNumber of Songs: "+standardAlbum.getNumOfSongs() );


            num++;
        }

    }
}


