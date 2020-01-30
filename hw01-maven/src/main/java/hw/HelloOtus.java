package hw;

import java.util.Random;

import static com.google.common.base.Preconditions.checkNotNull;

public class HelloOtus {
    public static void main(String[] args) {
        System.out.println(new IntegerInBox(1).getI());
        System.out.println(new IntegerInBox(new Random().nextInt()).getI());
        try {
            System.out.println(new IntegerInBox(null).getI());
        } catch (NullPointerException npe) {
            System.out.println("null has been caught before method getI()");
        }

    }
}

class IntegerInBox {
    private final Integer i;

    public IntegerInBox(Integer i) {
        this.i = checkNotNull(i);
    }

    public int getI() {
        return i;
    }
}