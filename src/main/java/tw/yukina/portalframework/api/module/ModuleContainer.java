package tw.yukina.portalframework.api.module;

import java.util.List;

import tw.yukina.portalframework.api.module.annotation.Module;
import tw.yukina.portalframework.api.util.*;
import tw.yukina.portalframework.api.job.*;
import tw.yukina.portalframework.api.step.*;

public interface ModuleContainer extends BaseInfo {

  public Class<?> getModuleClass();

  public Object getModuleObject();

  public Module getModuleAnnotation();

  public List<StepContainer> getStepContainerList();

  public List<JobContainer> getJobContainerList();

}
