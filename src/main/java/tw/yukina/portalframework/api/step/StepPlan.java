package tw.yukina.portalframework.api.step;

import java.util.Map;
import java.util.Set;
import tw.yukina.portalframework.api.util.*;

public interface StepPlan extends Plan{

//	TODO
	public boolean getIsAbstract();

	public Map<String, Class<?>> getRequireParametersDefine();

	public Map<String, Class<?>> getReturnDefine();

	public Class<? extends StepContainer> getStepContainerClass();
}
