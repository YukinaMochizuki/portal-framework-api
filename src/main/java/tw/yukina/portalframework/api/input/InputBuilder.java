package tw.yukina.portalframework.api.input;

import java.util.Set;

public interface InputBuilder {

  public InputBuilder setID(String id);

  public InputBuilder setName(String name);

  public InputBuilder setShortDepiction(String shortDepiction);

  public InputBuilder setDepiction(String depiction);

  public InputBuilder setTags(Set<String> tags);

  public InputBuilder setIsOption(boolean isOption);

}
