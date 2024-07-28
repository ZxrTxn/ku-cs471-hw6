/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class CountingPoliteDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new PoliteDuck(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new PoliteDuck(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new PoliteDuck(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new PoliteDuck(new RubberDuck()));
    }
}
