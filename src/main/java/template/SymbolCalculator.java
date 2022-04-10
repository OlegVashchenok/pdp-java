package template;

import java.util.HashMap;
import java.util.Map;

public class SymbolCalculator extends ConsoleProgram {

    public static void main(String[] args) {
        var sc = new SymbolCalculator();
        sc.run("введи строку");
    }


    @Override
    public String makeOperation(String request) {
        Map<String, Integer> map = new HashMap<>();
        for (var i : request.split("")) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int value = 0;
        String key = null;
        for (var j : map.entrySet()) {
            if (value < j.getValue()) {
                value = j.getValue();
                key = j.getKey();
            }
        }
        return key + " = " + value;
    }
}
