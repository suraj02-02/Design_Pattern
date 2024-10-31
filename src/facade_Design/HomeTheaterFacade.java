package facade_Design;

/**
 *  <p>
 *      This is the <code>Facade Class</code> for <code>Facade Design Pattern</code>
 *  </p>
 *  <p>
 *      Client will interact with different subsystems through this <code>Facade</code>
 *  </p>
 */

public class HomeTheaterFacade {

    private DvdSystem dvdSystem;
    private ProjectorSystem projectorSystem;
    private LightingSystem lightingSystem;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DvdSystem dvdSystem,
                             ProjectorSystem projectorSystem,
                             LightingSystem lightingSystem,
                             SoundSystem soundSystem) {

        this.dvdSystem = dvdSystem;
        this.projectorSystem = projectorSystem;
        this.lightingSystem = lightingSystem;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie){

        System.out.println("Setting up the Home theater.......");
        this.lightingSystem.dim();
        this.projectorSystem.turnOn();
        this.projectorSystem.setInput("DVD");
        this.soundSystem.on();
        this.soundSystem.adjustVolume(50);
        this.dvdSystem.turnOn();
        this.dvdSystem.play();
        System.out.println("Home theater setup is done.......");
    }

    public void endMovie(){

        System.out.println("Shutting down the Home theater.......");
        this.dvdSystem.stop();
        this.dvdSystem.turnOff();
        this.projectorSystem.turnOff();
        this.soundSystem.off();
        this.lightingSystem.unDim();
        System.out.println("Home theater shut down is done.......");
    }


}
