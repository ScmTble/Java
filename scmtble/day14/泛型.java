package scmtble.day14;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class 泛型 {
    @Test
    public void testList()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
//        list.add('a'); 报错
        System.out.println(list);
    }
}
