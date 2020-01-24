package tw.yukina.portalframework.api.util;

public class ObjectDefine {

	private String name;
	private Object object;
	private Class<?> define;

  public ObjectDefine(String name, Object object, Class<?> define) {
		this.name = name;
		this.object = object;
		this.define = define;
  }

	public void setName(String name) {
  	this.name = name;
	}

	public String getName() {
  	return name;
	}

	public void setObject(Object object) {
  	this.object = object;
	}

	public Object getObject() {
  	return object;
	}

	public void setDefine(Class<?> define) {
  	this.define = define;
	}

	public Class<?> getDefine() {
  	return define;
	}
}
