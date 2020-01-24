package tw.yukina.portalframework.api.step;

import java.util.Set;
import tw.yukina.portalframework.api.util.*;

public class StepContainer {

	private String id;
	private String depiction = "";
	private String shortDepiction = "";
	private Set<String> tags;
	private Set<ObjectDefine> returnDefine;
	private boolean isThreadSafe;

  private StepRunnable stepRunnable;

  public StepContainer(String id, String depiction, String shortDepiction, 
      StepRunnable stepRunnable, Set<String> tags, Set<ObjectDefine> returnDefine,
      boolean isThreadSafe) {
		this.id = id;
    this.stepRunnable = stepRunnable;
		this.depiction = depiction;
		this.shortDepiction = shortDepiction;
		this.tags = tags;
		this.returnDefine = returnDefine;
		this.isThreadSafe = isThreadSafe;
  }

  public StepContainer(String id, StepRunnable stepRunnable, Set<String> tags,
      Set<ObjectDefine> returnDefine, boolean isThreadSafe){
		this.id = id;
    this.stepRunnable = stepRunnable;
		this.tags = tags;
		this.returnDefine = returnDefine;
		this.isThreadSafe = isThreadSafe;
  }

	public String getId() {
  	return id;
	}

  public StepRunnable getStepRunnable() {
    return stepRunnable;
  }

	public void setDepiction(String depiction) {
  	this.depiction = depiction;
	}

	public String getDepiction() {
  	return depiction;
	}

	public void setShortDepiction(String shortDepiction) {
  	this.shortDepiction = shortDepiction;
	}

	public String getShortDepiction() {
  	return shortDepiction;
	}

	public void setTags(Set<String> tags) {
  	this.tags = tags;
	}

	public Set<String> getTag() {
  	return tags;
	}

	public Set<ObjectDefine> getReturnDefine() {
  	return returnDefine;
	}

	public void setIsThreadSafe(boolean isThreadSafe) {
  	this.isThreadSafe = isThreadSafe;
	}

	public boolean getIsThreadSafe() {
  	return isThreadSafe;
	}
}
