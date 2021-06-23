public class HomeTheaterTestDrive{
    public static void main(String[] args){
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd); /*tune, cd, projector, screen, lights, popper*/
        homeTheater.watchMovie("MARVEL Os Vingadores");
        homeTheater.endMovie();
    }
}