package lab4;

/**
 * Created by glenc on Aug 2021
 **/
public class ClassesOOP {
    public static void main(String[] args) {

        Music music = new Music("Glen","Standing here, my Eyes fixed on you!!");
        music.display();
    }

}

class Music{

    private String author;
    private String song;

    public Music(String author, String song){
        this.author = author;
        this.song = song;
    }

    public void display(){
        System.out.format(
                "%s written by %s",this.song, this.author
        );
    }

}
