package tw.yukina.portalframework.api.input;

import tw.yukina.portalframework.api.job.*;

public interface InputListener{

  public JobPlan getListeningJob();

  public Class<? extends InputEvent> getListeningType();

}
