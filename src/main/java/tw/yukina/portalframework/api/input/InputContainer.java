package tw.yukina.portalframework.api.input;

import tw.yukina.portalframework.api.util.*;

public interface InputContainer<T extends InputEvent> extends BaseInfo{

  public EventProvider<T> getEventProvider();
}
