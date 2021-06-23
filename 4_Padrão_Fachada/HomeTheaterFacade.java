public class HomeTheaterFacade{
    Amplifier amp;
    DvdPlayer dvd;
    /*
    Tuner tuner;
    CdPlayer cd;
    Projector projector;
    TheaterLigthts lights;
    Screen screen;
    PopcornPopper popper;
    */

    public HomeTheaterFacade(Amplifier amp,
                            DvdPlayer dvd
                            /*
                            Turner tuner,
                            CdPlayer cd,
                            Projector projector,
                            Screen screen,
                            TheaterLigthts lights,
                            PopcornPopper popper
                            */
                            ){
        this.amp = amp;
        this.dvd = dvd;
        /*
        this.tuner = tuner;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
        */
    }

    public void watchMovie(String movie){
        System.out.println("Prepare-se para assistir a um filme ...");
        /*
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        */
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("Fechando o cinema ...");
        /*
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        */
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}