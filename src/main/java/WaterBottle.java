public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int takeDrink() {
        return volume -= 10;
    }

    public int empty() {
       return this.volume = 0;
    }

    public int fill() {
        return this.volume = 100;
    }
}
