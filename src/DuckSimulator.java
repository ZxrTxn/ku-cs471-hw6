/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new PoliteDuck(new MallardDuck()));
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new QuackCounter(new PoliteDuck(new RubberDuck()));
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PoliteDuck(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator: With Decorator");

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

        System.out.println("The polite ducks quacked " +
                            QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
