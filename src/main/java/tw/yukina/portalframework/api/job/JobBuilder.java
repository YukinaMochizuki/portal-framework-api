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

  public JobBuilder setPermission(String permission);

  public JobBuilder setRequireParameters(Set<ObjectDefine> objectDefine);

  public JobBuilder setIsOption(boolean isOption);

  public JobBuilder setInputListener(InputListener inputListener);

  public JobBuilder setInputListener(Class<? extends InputEvent> eventType);

  public JobBuilder setIsAbstract(boolean isAbstract);

  public JobBuilder setReturnObject(Set<ObjectDefine> objectDefine);

  public JobBuilder setImplementJob(String implementJob);

  public JobBuilder start(String id);

  public JobBuilder start(StepPlan stepPlan);

  public JobBuilder next(String id);

  public JobBuilder next(StepPlan stepPlan);

  public JobBuilder end(String id);

  public JobBuilder end(StepPlan stepPlan);

  public JobPlan build();
}
