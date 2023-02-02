package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("STOP");
        System.out.println(info1.toString());
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(20);
        System.out.println(info2.toString());
        Integer i = info2.getValue();
    }
}

class Info<T> {
    private T value;
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue(){
        return value;
    }
}

