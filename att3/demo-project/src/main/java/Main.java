import vsu.ru.silnov.Range;
import vsu.ru.silnov.RangeMap;

public class Main {

    public static void main(String[] args)  {
        RangeMap<String,Range> rangeMap = new RangeMap<>();
        GUI gui = new GUI();
        gui.demoInterface(rangeMap);
    }
}
