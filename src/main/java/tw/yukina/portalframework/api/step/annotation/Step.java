package tw.yukina.portalframework.api.step.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Step {
    public String id();

    public String name() default "";

    public String[] tags() default {};

    public boolean isThreadSafe() default false;

    public boolean isDisable() default false;
}
