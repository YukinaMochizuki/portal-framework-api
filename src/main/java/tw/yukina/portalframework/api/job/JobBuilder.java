package tw.yukina.portalframework.api.job;

import tw.yukina.portalframework.api.step.*;
import tw.yukina.portalframework.api.util.*;
import tw.yukina.portalframework.api.input.*;

import java.util.Set;

public interface JobBuilder {

  public JobBuilder setID(String id);

  public JobBuilder setName(String name);

  public JobBuilder setShortDepiction(String shortDepiction);

  public JobBuilder setDepiction(String depiction);

  public JobBuilder setTags(Set<String> tags);

  public JobBuilder setIsOption(boolean isOption);

  public JobBuilder addInputListenersDefine(InputListener inputListener);

  public JobBuilder setInputListenersDefine(Set<InputListener> inputListeners);

  public JobBuilder setIsAbstract(boolean isAbstract);

  public JobBuilder setImplementJob(String implementJob);

  public JobBuilder startByStep(String id);

  public JobBuilder startByStep(StepPlan stepPlan);

  public JobBuilder nextByStep(String id);

  public JobBuilder nextByStep(StepPlan stepPlan);

  public JobBuilder endByStep(String id);

  public JobBuilder endByStep(StepPlan stepPlan);

  public JobBuilder startByJob(String id);

  public JobBuilder startByJob(JobPlan jobPlan);

  public JobBuilder nextByJob(String id);

  public JobBuilder nextByJob(JobPlan jobPlan);

  public JobBuilder endByJob(String id);

  public JobBuilder endByJob(JobPlan jobPlan);

  public JobPlan build();
}
