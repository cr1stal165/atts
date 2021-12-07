import vsu.ru.silnov.Range;
import vsu.ru.silnov.RangeMap;

public class Main {

    public static void main(String[] args)  {
        RangeMap<String, Range> rangeMap = new RangeMap<>();
        rangeMap.put("lesson",15,20);
        rangeMap.display();
    }
}
