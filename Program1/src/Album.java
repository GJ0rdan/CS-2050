//Garret Jordan
public class Album {
    String title, artist, genre;
    int numOfSongs;

    public Album(){
        this.title = "";
        this.artist = "";
        this.genre = "";
        this.numOfSongs = 0;
    }
    public Album(String title, String artist, String genre, int numOfSongs) {

        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.numOfSongs = numOfSongs;
    }

    //Setter and getter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    //Setter and getter for artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String newArtist) {
        this.artist = newArtist;
    }

    //Setter and getter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    //Setter and getter for numOfSongs
    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int newNumOfSongs) {
        this.numOfSongs = newNumOfSongs;
    }

    public String toString() {
        return title + ", " + artist + ", " + genre + ", " + numOfSongs;
    }

}

