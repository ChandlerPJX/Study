package Study_SE.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class test01 {

    @Myannotation
    public void run() {
    }


}

@Target(value = ElementType.METHOD)
@Retention(value =  RetentionPolicy.RUNTIME)
@interface Myannotation {
}
