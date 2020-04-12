package tw.yukina.portalframework.api.step;

import java.util.Map;
import java.util.Set;
import tw.yukina.portalframework.api.util.*;

public interface StepPlan extends BaseInfo{

	public boolean isClose();

	public void close();

	public boolean getIsAbstract();

	public boolean isDisable();

	public void setDisable(boolean isDisable);

	public Map<String, Class<?>> getRequireParametersDefine();

	public Map<String, Class<?>> getReturnDefine();

	public Class<? extends StepContainer> getStepContainerClass();
}
