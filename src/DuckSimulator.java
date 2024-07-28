/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingPoliteDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PoliteDuck(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        System.out.println();
        simulate(redheadDuck);
        System.out.println();
        simulate(duckCall);
        System.out.println();
        simulate(rubberDuck);
        System.out.println();
        simulate(gooseDuck);
        System.out.println();
        simulate(pigeonDuck);
        System.out.println();

        System.out.println("The ducks quacked " +
                            QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
