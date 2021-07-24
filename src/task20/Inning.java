package task20;

abstract public class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Doesn’t actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
        // Throws no checked exceptions
    }
}
