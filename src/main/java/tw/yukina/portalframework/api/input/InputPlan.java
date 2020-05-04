package tw.yukina.portalframework.api.input;

import tw.yukina.portalframework.api.util.Plan;

import java.util.Map;

public interface InputPlan extends Plan {

    public Map<String, Class<?>> getRequireEventContentDefine();

    public Map<String, Class<?>> getReturnDefine();

    public String getPreFormatJob();

    public String getPostFormatJob();

}
