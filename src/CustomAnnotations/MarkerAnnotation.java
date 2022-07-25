package CustomAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //when this annotation will be active or executed or evaluated
@Target(ElementType.TYPE) // (over here type means -> it can apply to a class type)
// what the annotation type will be applied upon
// (Target -> where this annotation is to applied ex- class, memberVariable or any other type (target audience))
public @interface MarkerAnnotation {

}

