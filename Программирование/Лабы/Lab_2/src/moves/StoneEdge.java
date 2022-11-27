package moves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.DARK, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (0.125 > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "использует Stone Edge";
    }
}

