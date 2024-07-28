/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
