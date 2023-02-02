package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("ty", 20);
        System.out.println("value1: " + pair1.getValue1() + "\n" + "value2: " + pair1.getValue2());
        PairOne<Integer> pair2 = new PairOne<>(20, 22);
        System.out.println("value1: " + pair2.getValue1() + "\n" + "value2: " + pair2.getValue2());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
class PairOne<V> {
    private V value1;
    private V value2;

    public PairOne(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}

