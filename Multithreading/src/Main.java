//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*world w = new world();
        w.start();
        UncheckedException.divide();*/
        world w = new world();
        Thread t1 = new Thread(w);
        t1.start();
        UncheckedException.nullString();
    }
}