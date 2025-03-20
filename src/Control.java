
public class Control {
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("The smartTV has be " + smartTV.power);
        smartTV.on();
        System.out.println("This smartTV has be " + smartTV.power);
        System.out.println("Chanel: " + smartTV.chanel);
        System.out.println("Volume: "+ smartTV.volume);
        
        System.out.println("Up the chanel");
        smartTV.upChanel();
        System.out.println("Chanel: " + smartTV.chanel);

        System.out.println("Set the Volume");
        smartTV.downVolume();
        System.out.println("Volume: " + smartTV.volume);


        smartTV.upVolume();
        System.out.println("Chanel: " + smartTV.chanel);
        System.out.println("Volume: "+ smartTV.volume);

        smartTV.downVolume();
        System.out.println("Chanel: " + smartTV.chanel);
        System.out.println("Volume: "+ smartTV.volume);

        smartTV.upChanel();
        System.out.println("Chanel: " + smartTV.chanel);
        System.out.println("Volume: "+ smartTV.volume);

        smartTV.downChanel();
        smartTV.downChanel();
        System.out.println("Chanel: " + smartTV.chanel);
        System.out.println("Volume: "+ smartTV.volume);

        smartTV.of();
        System.out.println("The smartTV has be " + smartTV.power);


    }
}
