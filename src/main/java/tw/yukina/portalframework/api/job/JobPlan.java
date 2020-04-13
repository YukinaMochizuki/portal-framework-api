package tw.yukina.portalframework.api.job;

import tw.yukina.portalframework.api.job.work.WorkDefine;
import tw.yukina.portalframework.api.step.*;
import tw.yukina.portalframework.api.util.*;
import tw.yukina.portalframework.api.input.*;

import java.util.Map;
import java.util.Set;
import java.util.List;

public interface JobPlan extends BaseInfo{

	public boolean isClose();

	public void close();

	public boolean getIsAbstract();

	public boolean isOption();

	public void  setIsOption(boolean isOption);

	public Set<InputListener> getInputListenersDefine();

	public List<WorkDefine> getJobWorkList();

	public String getImplementJob();
}
