package tw.yukina.portalframework.api.job;

import tw.yukina.portalframework.api.job.enums.WorkTypeEnum;

import java.util.Map;
import java.util.Set;

public interface JobContainer {

    public JobPlan getJobPlan();

    public WorkTypeEnum getWorkTypeEnum();

    public Set<Class<?>> getRequireParametersDefine();

    public Map<String, Class<?>> getReturnDefine();

    public void run(JobRuntimeController jobRuntimeController);

}
