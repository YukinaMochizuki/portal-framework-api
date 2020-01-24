package tw.yukina.portalframework.api.step;

import java.util.Map;
import java.lang.Object;

public abstract class StepRunnable {

    public abstract void exec();

    public abstract Map<String, Object> getReturnMap();

    public String getShortDepiction(){
        return "";
    }

    public String getDepiction(){
        return "";
    }

    public void clean(){}
}
