import java.util.HashSet;

class GenericHashSet<T> {
    private HashSet<T> set;

    public GenericHashSet() {
        set = new HashSet<>();
    }

    public void addElement(T element) {
        set.add(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }

    public void removeElement(T element) {
        set.remove(element);
    }

    public void displaySet() {
        System.out.println(set);
    }
}

