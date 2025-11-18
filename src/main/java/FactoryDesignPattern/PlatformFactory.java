package FactoryDesignPattern;

public class PlatformFactory {
    public static  Platform createPlatformInstance(String platformName){
        Platform platformInstance = null;

        if(platformName.equals("Android")){
            platformInstance = new Android();
        } else if(platformName.equals("iOS")){
            platformInstance = new iOS();
        }

        return platformInstance;
    }
}
