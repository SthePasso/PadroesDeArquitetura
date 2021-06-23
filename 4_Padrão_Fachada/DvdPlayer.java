public class DvdPlayer{
    public String movie = "";

    public void on(){
        System.out.println("DVD Player Top-O-Line ligado");
    }

    public void play(String movie){
        this.movie = movie;
        System.out.println("Leitor de DVD Top-O-Line reproduzindo "+this.movie);
    }

    public void stop(){
        System.out.println("O DVD Player Top-O-Line parou "+this.movie);
    }

    public void eject(){
        System.out.println("Finalizacao do reprodutor de DVD Top-O-Line");
    }

    public void off(){
        System.out.println("DVD Player Top-O-Line desligado");
    }
}