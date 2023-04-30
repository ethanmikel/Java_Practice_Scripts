import java.util.ArrayList;
import java.util.List;

public class ListGetLast {

    public static List<Integer> go(List<Integer> ray) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ray.size(); i++) {
            if (ray.get(i) > ray.get(ray.size()-1)) {
                result.add(ray.get(i));
            }
        }
        return result;
    }
}


