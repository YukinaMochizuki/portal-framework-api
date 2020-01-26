package tw.yukina.portalframework.api.step;

import java.util.Set;
import tw.yukina.portalframework.api.util.*;

public interface StepContainer extends BaseInfo{

	public Set<ObjectDefine> getReturnDefine();

	public void setIsThreadSafe(boolean isThreadSafe);

	public boolean getIsThreadSafe();

}
