package tw.yukina.portalframework.api.job.work;

import tw.yukina.portalframework.api.job.enums.WorkTypeEnum;

import java.util.Optional;

public class WorkDefine {

    private final WorkTypeEnum workTypeEnum;
    private final String id;

    public WorkDefine(WorkTypeEnum workTypeEnum, String id) {
        this.workTypeEnum = workTypeEnum;
        this.id = id;
    }

    public WorkTypeEnum getWorkTypeEnum() {
        return workTypeEnum;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
