package tw.yukina.portalframework.api.step;

import com.google.inject.Injector;

public interface StepContainer {

    public StepPlan getStepPlan();

    public void runStep(StepRuntimeController stepRuntimeController, Injector injector);

}
