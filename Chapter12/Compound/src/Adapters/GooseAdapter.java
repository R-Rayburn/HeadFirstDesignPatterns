package Adapters;

import Base.Goose;
import Base.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) { this.goose = goose; }

    public void quack() {
        goose.honk();
    }
}
