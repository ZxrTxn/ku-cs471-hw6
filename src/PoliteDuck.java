/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class PoliteDuck implements Quackable {
    Quackable duck;

    public PoliteDuck(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        ja();
    }

    void ja() {
        System.out.print("ja");
    }
}
