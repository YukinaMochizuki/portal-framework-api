package tw.yukina.portalframework.api.input;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

public abstract class InputEvent <T> {

    private final InputPlan inputPlan;

    public InputEvent(InputPlan inputPlan) {
        this.inputPlan = inputPlan;
    }

    public abstract String getEventPropertyString();

    public abstract boolean matches(T t);

    public abstract Map<String, Object> getEventContent();

    public InputPlan getInputPlan() {
        return inputPlan;
    }

    public final Class<?> getType(){
        return (Class<?>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
    }
}