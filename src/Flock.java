/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

import java.util.Iterator;
import java.util.ArrayList;

public class Flock implements Quackable {
    Quackable leader;
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        if (leader == null) {
            leader = quacker;
        } else {
            quackers.add(quacker);
        }
    }

    @Override
    public void quack() {
        if (leader != null) {
            for (int i = 0; i < 3; i++) {
                leader.quack();
            }
            System.out.println();
        }

        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
            System.out.println();
        }
    }
}
