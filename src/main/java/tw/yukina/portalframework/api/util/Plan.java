package tw.yukina.portalframework.api.util;

import tw.yukina.portalframework.api.util.BaseInfo;

public interface Plan extends BaseInfo {

    public boolean isClose();

    public void close();

    public boolean isDisable();

    public void setDisable(boolean isDisable);

}
