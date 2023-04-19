package collectionframework;

public class GenericsDemo<T> {

    private T t;
    private int i;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsDemo<Integer> obj = new GenericsDemo<>();

        obj.setT(10);
        System.out.println(obj.getT());

        GenericsDemo<String> obj1 = new GenericsDemo<>();
        obj1.setT("Pune");
        System.out.println(obj1.getT());

    }
}
