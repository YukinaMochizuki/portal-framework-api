package tw.yukina.portalframework.api.job;

import tw.yukina.portalframework.api.step.*;
import tw.yukina.portalframework.api.util.*;
import tw.yukina.portalframework.api.input.*;

import java.util.Set;
import java.util.List;

public interface JobContainer extends BaseInfo{

	public void setPermission(String permission);

	public String getPermission();

	public Set<ObjectDefine> getRequireParameter();

	public boolean getIsOption();

	public void setInputListener(InputListener inputListener);

	public InputListener getInputListener();

	public List<StepContainer> getStepControllerList();

	public boolean getIsAbstract();

	public Set<ObjectDefine> getReturnObject();

}
