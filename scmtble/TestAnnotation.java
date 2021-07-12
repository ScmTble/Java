package scmtble;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class TestAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> aClass = Class.forName("scmtble.person");
        // 获取类的注解
        DataBase annotation = aClass.getAnnotation(DataBase.class);
        System.out.println(annotation.value());

        // 获取类中变量的注解
        // 1.获取类中的字段
        Field name = aClass.getDeclaredField("name");
        // 2.根据字段获取注解
        Name annotation1 = name.getAnnotation(Name.class);
        System.out.println(annotation1.value());

        Field age = aClass.getDeclaredField("age");
        // 2.根据字段获取注解
        Age annotation2= age.getAnnotation(Age.class);
        System.out.println(annotation2.value());

    }

}

@DataBase("jdbc")
class person {
    @Name("ScmTble")
    private String name;

    @Age("20")
    private String age;
}


// 自定义三个注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DataBase{
     String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Name{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Age{
    String value();
}