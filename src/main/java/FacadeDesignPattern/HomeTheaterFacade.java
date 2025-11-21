package FacadeDesignPattern;

public class HomeTheaterFacade {
    AudioSystem audioSystem = new AudioSystem();
    VideoSystem videoSystem = new VideoSystem();
    LightSystem lightSystem = new LightSystem();

    public void startMovie(){
        audioSystem.start();
        videoSystem.start();
        lightSystem.start();
    }
}
