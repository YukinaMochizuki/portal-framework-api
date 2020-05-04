package tw.yukina.portalframework.api.input;

import java.lang.reflect.ParameterizedType;
import java.util.regex.Pattern;

public abstract class InputListener<T> {

    public abstract Class<? extends InputEvent<T>> getListeningType();

    public abstract T getListenerProperty();

    public Class<?> getType(){
        return (Class<?>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
    }
}
