package tw.yukina.portalframework.api.util;

import java.util.Set;

public interface BaseInfo {

	public String getId();

	public void setName(String name);

	public String getName();

	public void setShortDepiction(String shortDepiction);

	public String getShortDepiction();

	public void setDepiction(String depiction);

	public String getDepiction();

	public void setTags(Set<String> tags);

	public Set<String> getTags();
}
