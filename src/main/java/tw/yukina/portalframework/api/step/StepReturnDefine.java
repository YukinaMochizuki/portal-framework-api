package tw.yukina.portalframework.api.step;

import java.util.Map;

public class StepReturnDefine {
    private Map<String, Class<?>> returnDefine;

    public StepReturnDefine(Map<String, Class<?>> returnDefine) {
        this.returnDefine = returnDefine;
    }

    public Map<String, Class<?>> getReturnDefine() {
        return returnDefine;
    }
}
