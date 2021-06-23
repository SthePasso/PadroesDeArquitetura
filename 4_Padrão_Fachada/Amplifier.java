public class Amplifier{
    public int volume = 0;

    public void on(){
        System.out.println("Amplificador Top-O-Line ligado");
    }

    public void setDvd(DvdPlayer dvd){
        System.out.println("O amplificador Top-O-Line configurou o reprodutor de DVD para o reprodutor de DVD Top-O-Line");
    }

    public void setSurroundSound(){
        System.out.println("Som surround do amplificador Top-O-Line ligado (5 alto-falantes, 1 subwoofer)");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume do amplificador Top-O-Line para "+this.volume);
    }

    public void off(){
        System.out.println("Amplificador Top-O-Line desligado");
    }
}