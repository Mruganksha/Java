import java.util.Stack;

public class GenericStack<T> {
    private Stack<T> s = new Stack<>();

    public void push(T item){
        s.push(item);
    }

    public T pop(){
        return s.pop();
    }

    public boolean isEmpty(){
        return s.isEmpty();
    }
}
