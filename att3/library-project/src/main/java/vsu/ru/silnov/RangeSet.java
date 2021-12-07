package vsu.ru.silnov;

public class RangeSet<T>{

    private static final Boolean EXIST = true;
    private final RangeMap<T, Boolean> map = new RangeMap<>();

    public boolean contains(T o) {
        return map.containsKey(o);
    }

    public boolean add(T t) {
        if (map.containsKey(t)) {
            return false;
        }
        map.put(t, EXIST);
        return true;
    }

    public boolean remove(T o) {
        if (map.containsKey(o)) {
            map.remove(o);
            return true;
        }
        return false;
    }
}