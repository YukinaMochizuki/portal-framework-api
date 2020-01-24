package tw.yukina.portalframework.api.job;

import tw.yukina.portalframework.api.step.*;
import tw.yukina.portalframework.api.util.*;
import tw.yukina.portalframework.api.input.*;

import java.util.Set;

interface JobBuilder {

  public JobBuilder setID(String id);

  public JobBuilder setName(String name);

  public JobBuilder setShortDepiction(String shortDepiction);

  public JobBuilder setDepiction(String depiction);

  public JobBuilder setTags(Set<String> tags);

  public JobBuilder setPermission(String permission);

  public JobBuilder setRequireParameter(Set<ObjectDefine> objectDefine);

  public JobBuilder setIsOption(boolean isOption);

  public JobBuilder setInputListener(InputListener inputListener);

  public JobBuilder setIsAbstract(boolean isAbstract);

  public JobBuilder setReturnObject(Set<ObjectDefine> objectDefine);

  public JobBuilder start(String name);

  public JobBuilder start(StepContainer stepContainer);

  public JobBuilder next(String name);

  public JobBuilder next(StepContainer stepContainer);

  public JobBuilder end(String name);

  public JobBuilder end(StepContainer stepContainer);

}
