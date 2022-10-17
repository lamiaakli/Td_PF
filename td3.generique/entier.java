package td3;

public class Entier implements Sommable<Entier> {
    private final Integer val;

    public Entier(final Integer val) {
        this.val = val;
    }

    @Override
    public Entier sommer(Entier v) {
        return v;

    }

    public Integer getVal() {
        return val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

    }

    @Override
    public String toString() {
        return "Entier[" +
                "val=" + val +
                ']';
    }

}
