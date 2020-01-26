package tw.yukina.portalframework.api.input;

import tw.yukina.portalframework.api.job.*;

public interface InputListener{

  public JobContainer getListeningJob();

  public Class<? extends InputEvent> getListeningType();

  public JobContainer getPreInitJob();
}
