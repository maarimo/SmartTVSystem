public class SmartTV {
    String power = "Off";
    int volume = 25;
    int chanel = 1;

    public void on() {
        power = "On";
    }

    public void of() {
        power = "Off";
    }

    public void upVolume() {
        volume += 5;
    }

    public void downVolume() {
        volume -= 5;
    }

    public void upChanel() {
        chanel += 1;
    }

    public void downChanel() {
        chanel -= 1;
    }

}
