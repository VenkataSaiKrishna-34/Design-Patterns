package FacadeDesignPattern;

public class Client {
    public static void main(String[] args) {

        /*
           AudioSystem audioSystem = new AudioSystem();
            VideoSystem videoSystem = new VideoSystem();
            LightSystem lightSystem = new LightSystem();

            audioSystem.start();
            videoSystem.start();
            lightSystem.start();

            Instead of giving all these steps to client, its better to wrap all of them in one facade class and then expose that to client

         */

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.startMovie();
    }
}
