package client;

import java.util.ArrayList;
import java.util.List;

class Parser {

    static String[] parse(String string) {

        List<String> result = new ArrayList<>();
        String[] slitted = string.split(" ");


        result.add(slitted[0]);
        StringBuilder sb = new StringBuilder();
        boolean inside = false;

        for (int i = 1; i < slitted.length; i++) {
            if (!slitted[i].startsWith("\"")) {
                if (inside) {
                    sb.append(" ").append(slitted[i]);
                } else {
                    result.add(slitted[i]);
                    continue;
                }
            }
            if (slitted[i].startsWith("\"")) {
                sb.append(slitted[i]);
                sb.deleteCharAt(0);
                inside = true;
            }
            if (slitted[i].endsWith("\"")) {
                sb.deleteCharAt(sb.length() - 1);
                result.add(sb.toString());
                sb.delete(0, sb.length());
                inside = false;
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
