package scmtble;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class 常用类 {
    @Test
    public void test()
    {
        Date time = new Date();
        System.out.println(time);
        time.setTime(16187555435789l);
        System.out.println(time);
    }
}
