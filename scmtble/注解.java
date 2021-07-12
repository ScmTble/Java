package scmtble;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// 元注解用来标注可以什么上面使用,类，方法
@Target({ElementType.METHOD})
public @interface 注解 {
    // 参数 类型 + 参数名() default 默认值
    String name() default "Hello";
}
