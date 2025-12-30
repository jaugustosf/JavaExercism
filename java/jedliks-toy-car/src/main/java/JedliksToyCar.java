public class JedliksToyCar {
    private int distanceDisplay = 0;
    private int batteryDisplay = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distanceDisplay);
    }

    public String batteryDisplay() {
        if(batteryDisplay > 0){
            return String.format("Battery at %d%%", this.batteryDisplay);
        }
        return "Battery empty";
    }

    public void drive() {
        if (this.batteryDisplay > 0) {
            this.distanceDisplay += 20;
            this.batteryDisplay -= 1;
        }
    }
}
