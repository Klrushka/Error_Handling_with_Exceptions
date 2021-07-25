package task20;

public class StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
// must deal with the base constructor exceptions:

    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    // Regular methods must conform to base class:
    //! void walk() throws PopFoul {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    //! public void event() throws RainedOut {}
    // If the method doesn’t already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {
    }

    // You can choose to not throw any exceptions,
    // even if the base version does:
    public void event() {
    }

    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul {
    }

    public void loose() throws Loose{
        throw new Loose();
    }
}
