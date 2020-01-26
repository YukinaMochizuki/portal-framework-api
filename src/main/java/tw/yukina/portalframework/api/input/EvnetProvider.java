package tw.yukina.portalframework.api.input;

interface EventProvider<T extends InputEvent> {

  public String getID();

  public void postEvent(T event);

}
