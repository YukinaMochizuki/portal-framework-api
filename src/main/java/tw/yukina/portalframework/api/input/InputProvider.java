package tw.yukina.portalframework.api.input;

import java.util.Map;

public interface InputProvider<T> {

    public InputPlan getInputPlan();

    public Map<String, Object> postInputRequest(InputEvent<T> inputEvent);

}
